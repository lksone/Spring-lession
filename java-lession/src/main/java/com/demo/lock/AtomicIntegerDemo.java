package com.demo.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 这里可以通过referece去解决ABA问题
 * 判断他的版本号去解决问题，mysql 乐观锁机制也可以这么去处理
 */
public class AtomicIntegerDemo {

    private static AtomicInteger target = new AtomicInteger(10);

    private static AtomicStampedReference<Integer> reference = new AtomicStampedReference<>(10, 1);

    public static void main(String[] args) {
        //模拟多线程修改的过程，
        new Thread(() -> {
            int stamp = reference.getStamp();
            System.out.println(Thread.currentThread().getName() + "第一次的版本号" + stamp + ",当前实际值" + reference.getReference());
            reference.compareAndSet(10, 11, reference.getStamp(), reference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "第二次的版本号" + reference.getStamp() + ",当前实际值" + reference.getReference());
            reference.compareAndSet(11, 10, reference.getStamp(), reference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "第三次的版本号" + reference.getStamp() + ",当前实际值" + reference.getReference());
        }, "A线程").start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + "第一次的版本号" + reference.getStamp());
                boolean b = reference.compareAndSet(10, 12, reference.getStamp(), reference.getStamp() + 1);
                System.out.println(Thread.currentThread().getName() + "是否修改成功" + b + "当前版本" + reference.getStamp());
                System.out.println(Thread.currentThread().getName() + "当前实际值" + reference.getReference());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B线程").start();
    }
}
