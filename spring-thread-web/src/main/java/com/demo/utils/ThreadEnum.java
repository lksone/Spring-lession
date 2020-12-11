package com.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lks
 * @describe 线程池
 * @date 2020/12/1 17:03
 **/
@Slf4j
public enum  ThreadEnum {

    /**
     * 通用任务异步执行
     */
    COMMON_TASK("通用任务异步执行",
                        new ThreadPoolExecutor(4,
                    8,
                        1,
                TimeUnit.MINUTES,
                    new ArrayBlockingQueue<>(200),
                    new NamedThreadFactory("ops-thread")));


    private static class NamedThreadFactory implements ThreadFactory {
        private final AtomicInteger sequence = new AtomicInteger(1);
        private final String prefix;

        public NamedThreadFactory(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            int seq = sequence.getAndIncrement();
            thread.setName(prefix + (seq > 1 ? "-" + seq : ""));
            if (!thread.isDaemon()) {
                thread.setDaemon(true);
            }
            return thread;
        }
    }


    /**
     * 线程池信息
     */
    private final String name;

    /**
     * 线程池
     */
    private final ThreadPoolExecutor executor;


    ThreadEnum(String name, ThreadPoolExecutor executor) {
        this.executor = executor;
        this.name = name;
    }


    public Future submit(Runnable task) {
        return executor.submit(() -> {
            try {
                task.run();
            } catch (Exception e) {
                log.error("task.run err", e);
            }
        });
    }
}
