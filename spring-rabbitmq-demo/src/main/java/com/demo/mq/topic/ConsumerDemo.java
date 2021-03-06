package com.demo.mq.topic;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo {

    private static final String QUEUE_NAME = "queue_topic_1";
    private static final String EXCHANGE_NAME = "exchange_topic_1";
    private static final String EXCHANGE_ROUTING_KEY = "topic.*";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        //绑定exchange 和 routingkey的关系
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, EXCHANGE_ROUTING_KEY);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者A接收到的消息是：" + new String(body));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
