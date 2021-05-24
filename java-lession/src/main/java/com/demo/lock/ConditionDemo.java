package com.demo.lock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/20 10:09
 */
public class ConditionDemo {

    LinkedList<String> lists = new LinkedList<>();

    Lock lock = new ReentrantLock();

    //集合是否满的条件判断
    Condition fullCondition = lock.newCondition();

    //集合是否空的条件判断
    Condition emptyCondition = lock.newCondition();


    /**
     * 生产者
     */
    private void product() {
        lock.lock();
        try {
            //假如集合大小为10
            while (lists.size() == 10) {
                System.out.println("list is full");
                fullCondition.await();
            }
            //生产一个5位的随机字符串
            String randomString = getRandomString(5);
            //生成的数据添加到linkList中
            lists.add(randomString);
            System.out.println(String.format("product %s size %d  %s", randomString, lists.size(), Thread.currentThread().getName()));
            //通知消费者可以消费了
            emptyCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 消费者
     *
     * @return
     */
    private String consume() {
        lock.lock();
        try {
            while (lists.size() == 0) {
                System.out.println("list is empty");
                emptyCondition.await();
            }
            String first = lists.removeFirst();
            //通知生产者可以生产了
            fullCondition.signalAll();
            return first;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }

    /**
     * 生成随机字符串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        ConditionDemo test = new ConditionDemo();

        ExecutorService executorService = Executors.newCachedThreadPool();

        //线程个数控制消费的快还是生产的快
        for (int i = 0; i < 2; i++) {

            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.product();
                }
            });
        }

        for (int k = 0; k < 1; k++) {
            executorService.submit(() -> {
                System.out.println("cousumestart");
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String consume = test.consume();
                    System.out.println("consume " + consume + " " + Thread.currentThread().getName());
                }
            });
        }

        //等待输入，阻塞主线程不退出
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
