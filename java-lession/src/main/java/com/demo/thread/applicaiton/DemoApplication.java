package com.demo.thread.applicaiton;

/**
 * 线程的上下文切换
 */
public class DemoApplication {

    public static void main(String[] args) {
        //运行多线程
        MultiThreadTester test1 = new MultiThreadTester();
        test1.Start();
        //运行单线程
        SerialTester test2 = new SerialTester();
        test2.Start();
    }


    static class MultiThreadTester extends ThreadContextSwitchTester {
        @Override
        public void Start() {
            long start = System.currentTimeMillis();
            MyRunnable myRunnable1 = new MyRunnable();
            Thread[] threads = new Thread[4];
            //创建多个线程
            for (int i = 0; i < 4; i++) {
                threads[i] = new Thread(myRunnable1);
                threads[i].start();
            }
            for (int i = 0; i < 4; i++) {
                try {
                    //等待一起运行完
                    threads[i].join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("多线程 exce time: " + (end - start) + "ms");
            System.out.println("counter: " + counter);
        }

        // 创建一个实现Runnable的类
        class MyRunnable implements Runnable {
            public void run() {
                while (counter < 100000000) {
                    synchronized (this) {
                        if (counter < 100000000) {
                            increaseCounter();
                        }

                    }
                }
            }
        }
    }

    //创建一个单线程
    static class SerialTester extends ThreadContextSwitchTester {
        @Override
        public void Start() {
            long start = System.currentTimeMillis();
            for (long i = 0; i < count; i++) {
                increaseCounter();
            }
            long end = System.currentTimeMillis();
            System.out.println("单线程 exec time: " + (end - start) + "ms");
            System.out.println("counter: " + counter);
        }
    }

    /**
     * 数据自增的类型
     */
    static abstract class ThreadContextSwitchTester {
        public static final int count = 100000000;
        public volatile int counter = 0;

        public int getCount() {
            return this.counter;
        }

        public void increaseCounter() {

            this.counter += 1;
        }

        public abstract void Start();
    }
}