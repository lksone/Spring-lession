package com.demo.thread.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * 测试数据AtomicLong和LongAddr的性能
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/7 06:48
 */
public class AtomicLongAdderTest {

    public static void main(String[] args) throws Exception {
        testAtomicLongAdder(1, 10000000);
        testAtomicLongAdder(10, 10000000);
        testAtomicLongAdder(100, 10000000);
    }

    static void testAtomicLongAdder(int threadCount, int times) throws Exception {
        System.out.println("threadCount: " + threadCount + ", times: " + times);
        long start = System.currentTimeMillis();

        testLongAdder(threadCount, times);
        System.out.println("LongAdder 耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("threadCount: " + threadCount + ", times: " + times);
        long atomicStart = System.currentTimeMillis();

        testAtomicLong(threadCount, times);
        System.out.println("AtomicLong 耗时：" + (System.currentTimeMillis() - atomicStart) + "ms");
        System.out.println("----------------------------------------");

    }

    /**
     * atomicLong的使用
     *
     * @param threadCount
     * @param times
     * @throws Exception
     */
    static void testAtomicLong(int threadCount, int times) throws Exception {
        AtomicLong atomicLong = new AtomicLong();
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            list.add(new Thread(() -> {
                for (int j = 0; j < times; j++) {
                    atomicLong.incrementAndGet();
                }
            }));
        }

        for (Thread thread : list) {
            thread.start();
        }

        for (Thread thread : list) {
            thread.join();
        }

        System.out.println("AtomicLong value is : " + atomicLong.get());
    }

    /**
     * longAddr的使用
     *
     * @param threadCount
     * @param times
     * @throws Exception
     */
    static void testLongAdder(int threadCount, int times) throws Exception {
        LongAdder longAdder = new LongAdder();
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            list.add(new Thread(() -> {
                for (int j = 0; j < times; j++) {
                    longAdder.increment();
                }
            }));
        }

        for (Thread thread : list) {
            thread.start();
        }

        for (Thread thread : list) {
            thread.join();
        }

        System.out.println("LongAdder value is : " + longAdder.longValue());
    }


}

