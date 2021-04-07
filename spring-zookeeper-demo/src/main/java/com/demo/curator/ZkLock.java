package com.demo.curator;

import org.apache.curator.framework.CuratorFramework;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 创建分布式节点锁
 */
public class ZkLock {

    //ZkLock的节点链接
    private static final String ZK_PATH = "/zkLock";

    private static final String LOCK_PREFIX = ZK_PATH + "/";

    private static final long WAIT_TIME = 1000;

    //Zk客户端
    CuratorFramework client = null;

    private String locked_short_path = null;

    private String locked_path = null;

    private String prior_path = null;

    final AtomicInteger lockCount = new AtomicInteger(0);

    private Thread thread;

    public ZkLock(CuratorFramework client) {

    }
}
