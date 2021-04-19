package com.demo.utils;

import java.util.concurrent.*;

public class ThreadPool {


    private static ExecutorService executorService;

    /**
     * 核心线程数
     */
    private int corePoolSize = 2;

    /**
     * 最大线程数
     */
    private int maximumPoolSize = 4;

    /**
     * 保存线程存活时间
     */
    private long keepAliveTime = 1000;


    /**
     * 线程阻塞队列
     */
    private BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>();


    /**
     * 当前线程队列
     */
    private ThreadPool() {
        if (executorService == null) {
            executorService = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, workQueue);
        }
    }

    /**
     * 线程提交过程
     *
     * @param o
     */
    public static void submit(Runnable o) {
        final Future<?> submit = executorService.submit(o);
        if (submit != null) {

        }
    }
}
