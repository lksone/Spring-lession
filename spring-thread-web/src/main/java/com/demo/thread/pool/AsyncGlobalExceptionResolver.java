package com.demo.thread.pool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * 异常处理resolver 捕获异常
 */
@Slf4j
public class AsyncGlobalExceptionResolver implements AsyncUncaughtExceptionHandler {

    /**
     * 异常捕获处理
     *
     * @param throwable
     * @param method
     * @param objects
     */
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        log.error("【捕获异常信息】method={},error={}", method, throwable);
    }
}
