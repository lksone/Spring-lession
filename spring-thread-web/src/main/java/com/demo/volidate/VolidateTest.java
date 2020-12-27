package com.demo.volidate;

import java.util.concurrent.CountDownLatch;

public class VolidateTest {


    private static  int i = 0;

    private static final CountDownLatch lach = new CountDownLatch(10);


    private static void inc() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            new Thread(() -> {
                for (int k = 0; k < 1000; k++) {
                    inc();
                }
                //每执行一次减一
                lach.countDown();
            }).start();
        }
        lach.await();
        System.out.println(i);
    }
}
