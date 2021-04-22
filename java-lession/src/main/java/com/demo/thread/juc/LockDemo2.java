package com.demo.thread.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo2 {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        lock.unlock();
    }
}
