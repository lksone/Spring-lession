package com.demo.redis;

import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * redis的hash一致性算法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/31 15:58
 */
public class JedisProxy {

    /**
     * 指定
     */
    private static String[][] redisNodeList = {
            {"localhost", "6379"},
            {"localhost", "6380"},
            {"localhost", "6381"},
            {"localhost", "6382"},
    };

    private static Map<String, Jedis> serverConnectMap = new HashMap<>();

    private static SortedMap<Integer, String> virtualNodes = new TreeMap<>();

    private static final int VIRTUAL_NODES = 100;

    static {
        for (String[] str : redisNodeList) {
            addServer(str[0], str[1]);
        }
        System.out.println();
    }

    /**
     * 获取hash函数
     *
     * @param str
     * @return
     */
    private static int getHash(String str) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash ^ str.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        // 如果算出来的值为负数则取其绝对值
        if (hash < 0) {
            hash = Math.abs(hash);
        }
        return hash;
    }

    /**
     * 获取服务器地址
     *
     * @param node
     * @return
     */
    private static String getServer(String node) {
        // 得到带路由的结点的Hash值
        int hash = getHash(node);
        // 得到大于该Hash值的所有Map
        SortedMap<Integer, String> subMap = virtualNodes.tailMap(hash);
        // 第一个Key就是顺时针过去离node最近的那个结点
        if (subMap.isEmpty()) {
            subMap = virtualNodes.tailMap(0);
        }
        Integer i = subMap.firstKey();
        // 返回对应的虚拟节点名称，这里字符串稍微截取一下
        String virtualNode = subMap.get(i);
        return virtualNode.substring(0, virtualNode.indexOf("&&"));
    }

    /**
     * 添加服务器地址
     *
     * @param ip
     * @param port
     */
    public static void addServer(String ip, String port) {
        for (int i = 0; i < VIRTUAL_NODES; i++) {
            String virtualNodeName = ip + ":" + port + "&&VN" + String.valueOf(i);
            int hash = getHash(virtualNodeName);
            System.out.println("虚拟节点[" + virtualNodeName + "]被添加, hash值为" + hash);
            virtualNodes.put(hash, virtualNodeName);
        }
        serverConnectMap.put(ip + ":" + port, new Jedis(ip, Integer.parseInt(port)));
    }

    public String get(String key) {
        String server = getServer(key);
        Jedis serverConnector = serverConnectMap.get(server);
        if (serverConnector.get(key) == null) {
            System.out.println(key + "not in host: " + server);
        }
        return serverConnector.get(key);
    }

    public void set(String key, String value) {
        String server = getServer(key);
        Jedis serverConnector = serverConnectMap.get(server);
        serverConnector.set(key, value);
        System.out.println("set " + key + " into host: " + server);
    }

    /**
     * 清空map
     */
    public void flushdb() {
        for (String str : serverConnectMap.keySet()) {
            System.out.println("清空host: " + str);
            serverConnectMap.get(str).flushDB();
        }
    }

    /**
     * 目标百分比
     *
     * @param keyList
     * @return
     */
    public float targetPercent(List<String> keyList) {
        int mingzhong = 0;
        for (String key : keyList) {
            String server = getServer(key);
            Jedis serverConnector = serverConnectMap.get(server);
            if (serverConnector.get(key) != null) {
                mingzhong++;
            }
        }
        return (float) mingzhong / keyList.size();
    }
}
