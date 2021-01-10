package com.demo.thread.semaphore.demo1;

/**
 * 开启多个通道，然后执行数量和次数
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
       /* SemaphoreService service = new SemaphoreService();

        for (int i = 0; i < 30; i++) {
            MyThread thread = new MyThread("SemaphoreService-name",service);
            thread.start();
        }*/

        SemaphoreService2 service2 = new SemaphoreService2();

        for (int i = 0; i < 20; i++) {
            MyThread thread = new MyThread("fdsa", service2);
            thread.start();
            System.out.println("可用通路"+service2.availablePermits());
        }
    }
}
