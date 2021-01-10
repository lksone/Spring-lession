package com.demo.thread.semaphore.demo1;

import java.util.concurrent.Semaphore;

public class SemaphoreService2 extends SemaphoreService {


    private final Semaphore semaphore = new Semaphore(6);// 6表示总共有6个通路


    @Override
    public void doSomething() {
        try {
            //每次占用2個通道
            semaphore.acquire(2); // 2 表示进入此代码，就会消耗2个通路，2个通路从6个中扣除
            System.out.println(Thread.currentThread().getName() + ":doSomething start-" + getCurrentTime());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ":doSomething end-" + getCurrentTime());
            semaphore.release(2); // 释放占用的 2 个通路
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public int availablePermits() {    // 查看可用通路数
        return semaphore.availablePermits();
    }
}
