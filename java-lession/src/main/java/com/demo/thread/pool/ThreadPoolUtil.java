package com.demo.thread.pool;

import java.util.concurrent.*;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/15 12:49
 */
public class ThreadPoolUtil {

    /**
     * 创建线程池
     */
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(2), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread("threadPool");
            return thread;
        }
    });


    public static void myself() throws ExecutionException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(12312);
                }
            });
        }
    }

    public static void demo1(){
        //创建线程池
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            service.submit(() -> {
                System.out.println("i : " + finalI + "|线程名称：" + Thread.currentThread().getName());
            });
        }

    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myself();
    }
}
