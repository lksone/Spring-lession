package com.demo.thread.juc;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    private static ReentrantLock lock;

    public static void main(String[] args) {
        lock.lock();
    }
}
