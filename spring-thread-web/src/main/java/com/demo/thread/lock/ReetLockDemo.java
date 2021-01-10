package com.demo.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReetLockDemo {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        //加锁
        lock.lock();
        try {
            System.out.println("ReetLockDemo.main");
        } finally {
            lock.unlock();
        }
    }
}
