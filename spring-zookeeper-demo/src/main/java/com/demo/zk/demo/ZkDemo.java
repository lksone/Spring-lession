package com.demo.zk.demo;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

/**
 * @author lks
 * @describe 連接zookeeper數據庫
 * @date 2020/12/11 11:25
 **/
public class ZkDemo {


    private final static String ZKURL = "127.0.0.1:2181";

    private final static int CONNECTION_TIME_OUT = 3 * 1000;

    private final static int SESSION_TIME_OUT = 3 * 1000;


    public static void main(String[] args) throws Exception {
        RetryPolicy policy = new ExponentialBackoffRetry(1000, 3);
        //連接zookeeper连接数据
        CuratorFramework client = CuratorFrameworkFactory.builder()
                .connectString(ZKURL)
                .connectionTimeoutMs(CONNECTION_TIME_OUT)
                .sessionTimeoutMs(SESSION_TIME_OUT)
                .retryPolicy(policy).build();
        //三次
        client.start();
        System.out.println(client.getState());
        /**
         * 创建一个 允许所有人访问的 持久节点
         */
        client.create()
                //  如果没有父节点，递归创建
                .creatingParentsIfNeeded()
                //持久节点
                .withMode(CreateMode.PERSISTENT)
                .forPath("/aaa/bbb", "dfas".getBytes());
/*        //2. 创建永久有序节点
        client.create()
                .creatingParentsIfNeeded()
                .withMode(CreateMode.CONTAINER)
                .forPath("/bbb", "bbbfdsa".getBytes());
        //3. 创建临时节点
        client.create()
                //创建容器节点
                .creatingParentContainersIfNeeded()
                // 定时节点
                .withMode(CreateMode.EPHEMERAL)
                .forPath("/node012", "123".getBytes());
        //4. 创建临时有序节点
        client.create()
                //创建容器节点
                .creatingParentContainersIfNeeded()
                // 定时节点
                .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                .forPath("/node013", "123".getBytes());*/

        client.close();
    }
}
