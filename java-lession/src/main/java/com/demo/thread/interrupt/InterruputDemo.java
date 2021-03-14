package com.demo.thread.interrupt;


/**
 * 线程中断的使用
 */
public class InterruputDemo {

    /**
     * 当前线程并不会出现中断的现象，还是会执行的
     * <p>
     * Thread.java类中提供了两种方法：
     * <p>
     * this.interrupted(): 测试当前线程是否已经中断；
     * this.isInterrupted(): 测试线程是否已经中断；
     * 我们先来看看this.interrupted()方法的解释：
     * 测试当前线程是否已经中断，当前线程是指运行this.interrupted()方法的线程。
     *
     * @throws InterruptedException
     */
    private static void test() throws InterruptedException {
        Thread thread = new MyThreadInterruput();
        thread.start();
        try {
            Thread.sleep(100);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试当前线程是否中断，false,false，这个当前线程是main线程
     */
    private static void test2() {
        Thread thread = new MyThreadInterruput2();
        thread.start();
        try {
            Thread.sleep(200);
            thread.interrupt();

            System.out.println("stop 1??" + thread.interrupted());
            System.out.println("stop 2??" + thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 方法interrupted()的确判断出当前线程是否是停止状态。
     * 但为什么第2个布尔值是false呢？ 官方帮助文档中对interrupted方法的解释：
     * 测试当前线程是否已经中断。线程的中断状态由该方法清除。
     * 换句话说，如果连续两次调用该方法，则第二次调用返回false。
     */
    private static void test3() {
        Thread thread = Thread.currentThread();
        thread.interrupt();
        System.out.println("stop 1??" + thread.getName() + "----" + Thread.interrupted());
        System.out.println("stop 2??" + thread.getName() + "----" + Thread.interrupted());
    }

    /**
     * 返回:true,true
     * isInterrupted()并为清除状态，所以打印了两个true。
     */
    private static void test4() {
        Thread thread = new MyThreadInterruput2();
        thread.start();
        thread.interrupt();
        System.out.println("stop 1??" + thread.getName() + thread.isInterrupted());
        System.out.println("stop 2??" + thread.getName() + thread.isInterrupted());
    }

    /**
     * 线程停止的方法和方式
     * <p>
     * 能停止的线程--异常法（详情见Mythread3中的代码）
     */
    private static void stopThread1() {
        MyThread3 thread = new MyThread3();
        thread.start();
        try {
            Thread.sleep(100);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 异常中断的方式和方法去执行，直接异常不执行下面的流程的代码
     * MyThread3_1
     */
    private static void stopThread2() {
        MyThread3_1 thread = new MyThread3_1();
        thread.start();
        try {
            Thread.sleep(100);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    private static void stopThread3() {
        MyThread4 myThread4 = new MyThread4();
        myThread4.start();
        myThread4.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        stopThread3();
    }
}
