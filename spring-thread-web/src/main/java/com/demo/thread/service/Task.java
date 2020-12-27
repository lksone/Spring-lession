package com.demo.thread.service;

@FunctionalInterface
public interface Task<T> {

    T call();
}
