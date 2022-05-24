package com.demo.zk.zklock;

/**
 *
 * 锁
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/24 17:39
 */
public interface Lock {

    /**
     * 加锁方法
     *
     * @return 是否成功加锁
     */
    boolean lock() throws Exception;

    /**
     * 解锁方法
     *
     * @return 是否成功解锁
     */
    boolean unlock();
}
