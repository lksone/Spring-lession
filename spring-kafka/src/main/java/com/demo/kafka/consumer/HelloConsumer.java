package com.demo.kafka.consumer;


import com.demo.kafka.message.HelloMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 监听对象
     *
     * @param record
     */
    @KafkaListener(topics = {HelloMessage.TOPIC})
    public void onMessage(ConsumerRecord<Integer, String> record) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), record);
    }
}
