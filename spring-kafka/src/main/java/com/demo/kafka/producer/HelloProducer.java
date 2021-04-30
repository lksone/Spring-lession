package com.demo.kafka.producer;


import com.demo.kafka.message.HelloMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

@Component
public class HelloProducer {

    @Resource
    private KafkaTemplate<Object, Object> kafkaTemplate;

    /**
     * 发送消息
     *
     * @param id
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public void syncSend(Integer id) throws ExecutionException, InterruptedException {
        // 创建 Demo01Message 消息
        HelloMessage message = new HelloMessage();
        message.setId(id);
        // 同步发送消息
        kafkaTemplate.send(HelloMessage.TOPIC, "message-key", message);
    }

    public ListenableFuture<SendResult<Object, Object>> asyncSend(Integer id) {
        // 创建 Demo01Message 消息
        HelloMessage message = new HelloMessage();
        message.setId(id);
        // 异步发送消息
        return kafkaTemplate.send(HelloMessage.TOPIC, message);
    }
}
