package com.demo.refence;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lks
 * @describe 虛引用的使用和方法的演示
 * @Email 1056224715@qq.com
 * @date 2020/12/24 17:22
 **/
public class NickDemo {

    private static final List<Object> TEST_DATA = new LinkedList<>();
    private static final ReferenceQueue<Object> QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) {
        Integer obj = Integer.valueOf(1);
        //需引用
        PhantomReference<Object> phantomReference = new PhantomReference<>(obj, QUEUE);

        // 该线程不断读取这个虚引用，并不断往列表里插入数据，以促使系统早点进行GC
        new Thread(() -> {
            while (true) {
                TEST_DATA.add(new byte[1024 * 100]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                System.out.println(phantomReference.get());
            }
        }).start();

        // 这个线程不断读取引用队列，当弱引用指向的对象呗回收时，该引用就会被加入到引用队列中
        new Thread(() -> {
            while (true) {
                Reference<? extends Object> poll = QUEUE.poll();
                if (poll != null) {
                    System.out.println("--- 虚引用对象被jvm回收了 ---- " + poll);
                    System.out.println("--- 回收对象 ---- " + poll.get());
                }
            }
        }).start();

        obj = null;

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}