package com.demo.thread.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{
    private final CountDownLatch countDown;

    private final CountDownLatch await;

    MyRunnable(CountDownLatch countDown, CountDownLatch await) {
        this.countDown = countDown;
        this.await = await;
    }


    @lombok.SneakyThrows
    @Override
    public void run() {
        countDown.await();//等待主线程执行完毕，获得开始执行信号...
        System.out.println("处于等待的线程开始自己预期工作......");
        await.countDown();//完成预期工作，发出完成信号...
        List<String> list = new ArrayList<>();
    }
}
