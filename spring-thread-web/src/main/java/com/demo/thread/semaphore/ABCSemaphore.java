package com.demo.thread.semaphore;

import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;


/**
 * 线程交替执行
 */
public class ABCSemaphore {

    private static Semaphore A = new Semaphore(1);
    private static Semaphore B = new Semaphore(1);
    private static Semaphore C = new Semaphore(1);


    static class ThreadA extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                A.acquire();
                System.out.println("ThreadA.run");
                B.release();
            }
        }
    }

    static class ThreadB extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                B.acquire();
                System.out.println("ThreadB.run");
                C.release();
            }
        }
    }

    static class ThreadC extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                C.acquire();
                System.out.println("ThreadC.run");
                A.release();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        B.acquire();
        C.acquire();
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();

    }
}
