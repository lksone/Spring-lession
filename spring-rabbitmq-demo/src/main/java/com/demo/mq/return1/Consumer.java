package com.demo.mq.return1;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class Consumer {

    private static final String EXCHANGE_NAME = "exchange_return_1";
    private static final String ROUTING_KEY = "return.save";
    private static final String QUEUE_NAME = "queue_return_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者收到消息：" + new String(body));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
