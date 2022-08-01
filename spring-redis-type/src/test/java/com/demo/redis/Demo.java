package com.demo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RCountDownLatch;
import org.redisson.api.RLock;
import org.redisson.api.RSemaphore;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/7/24 23:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Demo {

    @Autowired
    private RedissonClient redisson;

    @Test
    public void test() throws InterruptedException {
        RLock lockdemo = redisson.getLock("lockdemo");
        lockdemo.lock();
        // 尝试加锁，最多等待100秒，上锁以后10秒自动解锁
        boolean res = lockdemo.tryLock(100, 10, TimeUnit.SECONDS);
        if (res) {
            System.out.println(123);
        }
    }

    @Test
    public  void test2() throws InterruptedException {

        RSemaphore semaphore = redisson.getSemaphore("semaphore");
        // 同时最多允许3个线程获取锁
        semaphore.trySetPermits(3);
        for(int i = 0; i < 2; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]尝试获取Semaphore锁");
                        semaphore.acquire();
                        System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]成功获取到了Semaphore锁，开始工作");
                        Thread.sleep(3000);
                        System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]释放Semaphore锁");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }


    /**
     * 信号量
     *
     * @throws InterruptedException
     */
    @Test
    public  void test3() throws InterruptedException {

        RCountDownLatch anyCountDownLatch = redisson.getCountDownLatch("anyCountDownLatch");
        // 同时最多允许3个线程获取锁，只有等到有3個線程一起才會去執行
        anyCountDownLatch.trySetCount(3);
        for(int i = 0; i < 3; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]在做一些操作，请耐心等待。。。。。。");
                        Thread.sleep(3000);
                        //获取锁
                        RCountDownLatch localLatch = redisson.getCountDownLatch("anyCountDownLatch");
                        localLatch.countDown();
                        System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]执行countDown操作");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            anyCountDownLatch.await();
            System.out.println(new Date() + "：线程[" + Thread.currentThread().getName() + "]收到通知，有3个线程都执行了countDown操作，可以继续往下走");
        }
    }

    @Test
    public void test4(){
        String s = new String("123");
        String s2 = new String("123");
        String s1 = "123";
        System.out.println(s);
        System.out.println(s1);

        System.out.println(s.equals(s2));
        System.out.println(s1.equals(s));
    }
}
