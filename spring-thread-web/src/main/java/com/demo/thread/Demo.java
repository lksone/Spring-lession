package com.demo.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author lks
 * @describe countDownLatch
 * @date 2020/12/1 14:19
 **/
public class Demo {

    static final CountDownLatch countDownLatch = new CountDownLatch(2);


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(()->{
                countDownLatch.countDown();
                System.out.println("Demo.main"+ finalI);
            }).start();
            countDownLatch.await();
        }

    }
}
