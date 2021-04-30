package com.demo.kafka.producer;


import com.demo.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DemoTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HelloProducer producer;

    @Test
    public void testSyncSend() throws ExecutionException, InterruptedException {
        int id = (int) (System.currentTimeMillis() / 1000);
        producer.syncSend(id);
        // 阻塞等待，保证消费
        new CountDownLatch(1).await();
    }
}
