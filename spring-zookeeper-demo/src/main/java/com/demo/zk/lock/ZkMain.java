package com.demo.zk.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZkMain {

    private final static String node = "/test1";

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 4; i++) {
            service.execute(() -> {
                ZKLockUtil test = new ZKLockUtil();
                try {
                    test.lock(node);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.unlock(node);
            });
        }
        service.shutdown();
    }
}
