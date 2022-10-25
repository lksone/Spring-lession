package com.demo.utils;

import java.util.Random;

/**
 * 现象数据信息
 *
 * @Author lks
 * @E-mail 13552418058@163.com
 * @Since 1.0
 * @Date 2022/10/18 18:59
 */
public class ThreadMain {


    public static void main(String[] args) throws InterruptedException {
        test2();
    }


    /**
     * test1
     * @throws InterruptedException
     */
    public static void test1() throws InterruptedException {
        ThreadPoolUtils pool = new ThreadPoolUtils(5,5,10, "A业务线程池");
        // 14个正常任务
        for (int i = 0; i < 14; i++){
            pool.execute(() -> {
                try {
                    // 模拟任务耗时
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String taskName = randomName();
                System.out.println(Thread.currentThread().getName() + "-执行【" + taskName + "】");
            });
        }
        // 1个异常任务
        pool.execute(() -> {
            String taskName = randomName();
            throw new RuntimeException("执行【" + taskName + "】" + "异常");
        });
        // 5个多余用来拒绝的任务
        for (int i = 0; i < 5; i++){
            pool.execute(() -> {
                throw new RuntimeException("多余任务");
            });
        }
        System.out.println("任务完成情况：" + pool.getExecuteResult());

        pool.shutdown();

        Thread.sleep(20000);
    }


    /**
     * test2
     * @throws InterruptedException
     */
    public static void test2() throws InterruptedException {
        ThreadPoolUtils pool = new ThreadPoolUtils(5,5,10, "A业务线程池");
        // 14个正常任务
        for (int i = 0; i < 14; i++){
            pool.execute(new ThreadPoolUtils.SimpleTask() {
                @Override
                public void run() {
                    try {
                        // 模拟任务耗时
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 随机名称
                    String taskName = randomName();
                    super.setTaskName(taskName);
                    System.out.println(Thread.currentThread().getName() + "-执行【" + taskName + "】");
                }
            });
        }
        // 1个异常任务
        pool.execute(new ThreadPoolUtils.SimpleTask() {
            @Override
            public void run() {
                // 随机名称
                String taskName = randomName();
                super.setTaskName(taskName);
                throw new RuntimeException("执行【" + taskName + "】" + "异常");
            }
        });
        // 5个多余用来拒绝的任务
        for (int i = 0; i < 5; i++){
            pool.execute(new ThreadPoolUtils.SimpleTask() {
                @Override
                public void run() {
                    // 随机名称
                    String taskName = randomName();
                    super.setTaskName(taskName);
                    throw new RuntimeException("多余任务");
                }
            });
        }
        System.out.println("任务完成情况：" + pool.getExecuteResult());

        pool.shutdown();

        Thread.sleep(20000);
    }


    /**
     * 随机名称
     * @return
     */
    private static String randomName(){
        return "任务" + (char) (new Random().nextInt(60) + 65);
    }
}
