package com.demo.mq.direct;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo {

    private static final String QUEUE_NAME = "queue_direct_1";
    private static final String EXCHANGE_NAME = "exchange_direct_1";
    private static final String EXCHANGE_ROUTING_KEY1 = "direct_km1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, EXCHANGE_ROUTING_KEY1);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者1接收到的消息是：" + new String(body));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
