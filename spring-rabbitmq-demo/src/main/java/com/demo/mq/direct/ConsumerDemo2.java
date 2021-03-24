package com.demo.mq.direct;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo2 {

    private static final String QUEUE_NAME = "queue_direct_2";
    private static final String EXCHANGE_NAME = "exchange_direct_1";
    //路由2
    private static final String EXCHANGE_ROUTING_KEY2 = "direct_km2";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //同一个exchange
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //设置模式
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        //对其进行绑定
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, EXCHANGE_ROUTING_KEY2);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者2接收到的消息是：" + new String(body));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
