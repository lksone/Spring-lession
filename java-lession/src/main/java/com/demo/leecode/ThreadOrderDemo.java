package com.demo.leecode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lks
 * @date 2020-09-20 22:24
 * @email 1056224715@qq.com
 * @Description 按照指定的方式执行线程的执行顺序
 */
public class ThreadOrderDemo {

    private AtomicInteger firstJob = new AtomicInteger(0);
    private AtomicInteger secondJob = new AtomicInteger(0);


    public ThreadOrderDemo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstJob.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (firstJob.get() != 1) {

        }
        secondJob.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (secondJob.get() != 2) {

        }
        printThird.run();
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("开始");
            }
        };
    }
}
