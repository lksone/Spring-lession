package com.demo;

import java.util.*;

/**
 *
 * 负载均衡算法
 *
 * @Author lks
 * @E-mail 13552418058@163.com
 * @Since 1.0
 * @Date 2022/10/18 11:28
 */
public class LoadBalanceAlt {

    /**
     * 完全随机算法
     */
    public static String  absoluteRandom(){
        List<String> serverList = new ArrayList<>();
        serverList.add("server1");
        serverList.add("server2");
        serverList.add("server3");
        Random random = new Random();
        int randomNum = random.nextInt(serverList.size());
       return serverList.get(randomNum);
    }

    /**
     * 加权随机算法
     */
    public static void weightRandom(){
        Map<String,Integer> serverMap = new HashMap<>();
        serverMap.put("server1",2);
        serverMap.put("server2",5);
        serverMap.put("server3",9);

        Set<Map.Entry<String, Integer>> entries = serverMap.entrySet();
        for (Map.Entry<String,Integer> entry:entries) {
            //遍历
        }
    }
}
