package com.demo.zk.zklock;

/**
 *
 * 基於zookeeper锁的实现
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/24 17:46
 */
public class ZkLock implements Lock{

    public ZkLock() {
    }

    @Override
    public boolean lock() throws Exception {
        return false;
    }

    @Override
    public boolean unlock() {
        return false;
    }
}
