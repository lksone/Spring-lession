package com.demo.thread.semaphore.demo1;


/**
 * 每一个线程都执行service方法
 */
public class MyThread extends Thread {

    private SemaphoreService semaphoreService;

    public MyThread(String name, SemaphoreService semaphoreService) {
        super();
        this.semaphoreService = semaphoreService;
        this.setName(name);
    }

    @Override
    public void run() {
        this.semaphoreService.doSomething();
    }
}
