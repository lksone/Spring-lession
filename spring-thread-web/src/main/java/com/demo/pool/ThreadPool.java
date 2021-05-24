package com.demo.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {


    private ThreadPoolExecutor threadPoolExecutor = null;


    private ThreadPool() {
        if (threadPoolExecutor == null) {
            threadPoolExecutor = new ThreadPoolExecutor(10, 10, 1000,
                    TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1000));
        }
    }

}
