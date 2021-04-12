package com.demo.thread.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ReetLockDemo {

    public static void main(String[] args) {
        final ReentrantLock lock = new ReentrantLock();

        List<Thread> threads = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread("线程： " + i) {
                @Override
                public void run() {
                    try {
                        //加锁
                        lock.lock(); // 如果线程被中断了在这里会抛出异常
                        System.out.println(Thread.currentThread().getName() + " 开始执行！");
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + " 执行结束！");
                    } catch (InterruptedException e) {
                        // 这里处理线程中断的后续逻辑
                        System.out.println(Thread.currentThread().getName() + "  被打断！");
                    } finally {
                        lock.unlock();
                    }
                }
            };
            threads.add(thread);
            thread.start();
        }

    }
}
