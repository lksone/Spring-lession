package com.demo.thread.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    final Lock lock = new ReentrantLock();
    //获取的是一个condition队列
    final Condition condition = lock.newCondition();

    public static void main(String[] args) {
        //添加一个锁
        LockDemo test = new LockDemo();
        //提供者
        Producer producer = test.new Producer();
        //消费者
        Consumer consumer = test.new Consumer();

        //提供者和消费者
        consumer.start();
        producer.start();
    }

    /**
     * 消费者
     */
    class Consumer extends Thread{

        @Override
        public void run() {
            consume();
        }

        private void consume() {
            try {
                //加鎖
                lock.lock();
                System.out.println("我在等一个新信号"+this.currentThread().getName());
                //線程喚醒
                condition.await();

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally{
                System.out.println("拿到一个信号"+this.currentThread().getName());
                lock.unlock();
            }

        }
    }

    /**
     * 提供者
     */
    class Producer extends Thread{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            try {
                lock.lock();
                System.out.println("我拿到锁"+this.currentThread().getName());
                condition.signalAll();
                System.out.println("我发出了一个信号："+this.currentThread().getName());
            } finally{
                lock.unlock();
            }
        }
    }
}
