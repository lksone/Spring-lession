package com.demo.thread.juc;

import java.util.concurrent.CountDownLatch;

/**
 * 只有等到5個線程時才會啟動
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDown = new CountDownLatch(1);
        CountDownLatch await = new CountDownLatch(5);
        for (int i = 0; i < 7; i++) {
            new Thread(new MyRunnable(countDown, await)).start();
        }
        System.out.println("main用于触发处于等待状态的线程工作完成，等待状态线程开始工作......");

        countDown.countDown();

        await.await();

        System.out.println("Bingo!");
    }
}
