package com.demo.thread.pool;

import org.slf4j.MDC;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 自定义线程池，springboot 的设置方式和方法
 */
@Configuration
public class AsyncConfigDemo implements AsyncConfigurer {

    @Bean("taskExecutor")
    @Lazy
    @Override
    public Executor getAsyncExecutor() {

        MyThreadPoolTaskExecutor executor = new MyThreadPoolTaskExecutor();
        //根据自己机器配置
        executor.setCorePoolSize(1);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(512);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setThreadNamePrefix("propertyAsyncThread-");
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncGlobalExceptionResolver();
    }

    private class MyThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

        @Override
        public Future<?> submit(Runnable task) {
            return super.submit(task);
        }

        @Override
        public <T> Future<T> submit(Callable<T> task) {
            return super.submit(task);
        }

        @Override
        public void execute(Runnable task, long startTimeout) {
            super.execute(() -> {
                MDC.put("requestId", UUID.randomUUID().toString().replace("-", ""));
                task.run();
                MDCUtil.delRequestID();
            }, startTimeout);
        }
    }
}
