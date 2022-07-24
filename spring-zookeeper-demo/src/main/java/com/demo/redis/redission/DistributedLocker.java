package com.demo.redis.redission;

import java.util.concurrent.TimeUnit;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/21 12:10
 */
public interface DistributedLocker {
    /**
     *
     * @param lockKey
     */
    void lock(String lockKey);

    void unlock(String lockKey);

    void lock(String lockKey, int timeout);

    void lock(String lockKey, TimeUnit unit , int timeout);
}
