package com.demo.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;
import org.apache.curator.retry.RetryUntilElapsed;
import org.apache.zookeeper.CreateMode;

public class ZkUtils {


    private final static int SESSION_TIME = 3 * 1000;

    private final static int CONNECTION_TIME = 3 * 1000;

    private static String PATH = "101.200.235.14:2181";

    private static CuratorFramework build = null;


    public static void main(String[] args) {
        init();
        create("/aaa","fds");
        byte[] read = read("/aaa");
        System.out.println(read);
    }
    /**
     * 創建
     */
    public static CuratorFramework init(){
        if(build == null){
            RetryPolicy retryPolicy = new RetryUntilElapsed(1000,3);
            build = CuratorFrameworkFactory.builder()
                    .connectString(PATH)
                    .connectionTimeoutMs(CONNECTION_TIME)
                    .sessionTimeoutMs(SESSION_TIME)
                    .retryPolicy(retryPolicy)
                    .build();
            //開啟鏈接
            build.start();
        }
        return build;
    }

    /**
     * 创建节点
     *
     * @param path      節點
     * @param data
     * @return
     */
    public static Boolean create(String path,String data){
        try {
            build.create()
                    .creatingParentContainersIfNeeded()
                    .withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
                    .forPath(path,data.getBytes());
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Boolean.FALSE;
    }


    public static void close(){
        if(build!=null){
            build.close();
        }
    }

    /**
     * 刪除節點
     * @param path
     * @return
     */
    public static Boolean remove(String path){
        try {
            build.delete().deletingChildrenIfNeeded().forPath(path);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Boolean.FALSE;
    }

    /**
     * 读取数据
     *
     * @param path
     * @return
     */
    public static byte[] read(String path){
        try {
            return   build.getData()
                    .forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取读写锁
     * @param path
     * @return
     */
    public static InterProcessReadWriteLock getReadWriteLock(String path){
        return new InterProcessReadWriteLock(build, path);
    }
}
