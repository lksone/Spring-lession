package com.demo.zk.demo;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

/**
 * @author lks
 * @describe zookeeper連接工具類
 * @date 2020/12/11 15:59
 **/
public class ZkClient {

    private final static String ZK_URL = "124.221.218.66:2181";

    private final static int CONNECTION_TIME_OUT= 3*1000;

    private final static int SESSION_TIME_OUT= 3*1000;

    private static CuratorFramework client = null;


    /**
     * 创建地区角色
     */
    public static void  createFactory(){
        RetryPolicy policy = new ExponentialBackoffRetry(1000,3);
        //連接zookeeper连接数据
        client = CuratorFrameworkFactory.builder()
                .connectString(ZK_URL)
                .connectionTimeoutMs(CONNECTION_TIME_OUT)
                .sessionTimeoutMs(SESSION_TIME_OUT)
                .namespace("base")
                .retryPolicy(policy).build();
        client.start();
    }

    /**
     * 创建节点
     *
     * PERSISTENT：永久节点
     * PERSISTENT_SEQUENTIAL：永久顺序节点
     * EPHEMERAL：临时节点
     * EPHEMERAL_SEQUENTIAL：临时顺序节点
     * CONTAINER：容器
     * PERSISTENT_WITH_TTL： ttl保持一致
     * PERSISTENT_SEQUENTIAL_WITH_TTL: ttl永久序列化
     *
     * @param path      路径
     * @param data      存储的数据
     * @return
     */
    public static Boolean createNode(String path,String data){
        try {
            client.create().creatingParentsIfNeeded()
                    .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                    .forPath(path,data.getBytes());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 删除节点
     * @param path          数据
     * @param versionCode
     * @return
     */
    public static Boolean deleteNode(String path,int versionCode){
        try {
            client.delete()
                    .guaranteed()   //保证强制删除
                    .deletingChildrenIfNeeded() //递归删除
                    .withVersion(versionCode)//删除版本
                    .forPath(path);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 读取数据
     *
     * @param path  删除点数据
     * @return
     */
    public static byte[] read(String path){
        try {
           return client.getData().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 关闭zookeeper连接
     */
    public static void close(){
        client.close();
    }

}
