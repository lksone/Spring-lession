package com.demo.curator;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CuratorUtils {

    private final static String zkAddr = "127.0.0.1:2181";

    private final static String lockPath = "/distribute-lock";

    private static CuratorFramework cf;

    public CuratorUtils() {
        //重试机制，3次
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        cf = CuratorFrameworkFactory.builder()
                .connectString(zkAddr)
                .sessionTimeoutMs(2000)
                .retryPolicy(retryPolicy)
                .build();
        cf.start();
    }

    /**
     * 试图获取锁
     *
     * @param lock
     */
    private static void process(InterProcessLock lock) {
        System.out.println(Thread.currentThread().getName() + " acquire");
        try {
            lock.acquire();
            System.out.println(Thread.currentThread().getName() + " 获取锁成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " 释放锁");
            try {
                lock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 释放锁 success");
    }

    public static void main(String[] args) {
        CuratorUtils utils = new CuratorUtils();
        //创建一个锁
        InterProcessMutex lock = new InterProcessMutex(cf, lockPath);
        new Thread("thread-1") {
            @Override
            public void run() {
                process(lock);
            }
        }.start();
        new Thread("thread-2") {
            @Override
            public void run() {
                process(lock);
            }
        }.start();
    }
}
