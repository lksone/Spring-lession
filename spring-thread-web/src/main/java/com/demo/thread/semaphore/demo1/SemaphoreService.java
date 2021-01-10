package com.demo.thread.semaphore.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

public class SemaphoreService {

    private Semaphore semaphore = new Semaphore(3);
    private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public void doSomething() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "start-time" + getCurrentTime());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "end");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public String getCurrentTime() {
        return sf.format(new Date());
    }
}
