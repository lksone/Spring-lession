package com.demo.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import java.util.concurrent.TimeUnit;

public class ZkLock {

    private static final String ZK_LOCK_PATH = "/zktest/lock0";

    public static void main(String[] args) {
        //链接
        CuratorFramework client = ZkUtils.init();
        //
        ZkUtils.create(ZK_LOCK_PATH,"fds");
        final InterProcessMutex mutex = new InterProcessMutex(client, ZK_LOCK_PATH);

        for (int i = 0; i < 3; i++) {
            Runnable myRunnable = new Runnable() {
                @Override
                public void run() {
                    doWithLock(client, mutex);
                }
            };
            Thread thread = new Thread(myRunnable, "Thread-" + i);
            thread.start();
        }

    }

    /**
     * 写入指定的地址信息
     *
     * @param client
     * @param mutex
     */
    private static void doWithLock(CuratorFramework client, InterProcessMutex mutex) {
        try {
            String name = Thread.currentThread().getName();
            if (mutex.acquire(1, TimeUnit.SECONDS)) {
                System.out.println(name + " hold lock");
                System.out.println(client.getChildren().forPath(ZK_LOCK_PATH));
                Thread.sleep(5000L);
                System.out.println(name + " release lock");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
