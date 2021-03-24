package com.demo.mq.publish;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo2 {

    // 声明队列的名字
    private static final String QUEUE_NAME = "queue_publish_1";
    // 声明交换机的名字
    private static final String EXCHANGE_NAME = "exchange_publish_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 声明交换机
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        // 将队列绑定到交换机
        /**
         *  param1：destination，目的地，队列的名字
         *  param2：source，资源，交换机的名字
         *  param3：routingKey，路由键（目前没有用到routingKey，填 "" 即可）
         */
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "");
        // 声明消费者
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("队列1接收到的消息是：" + new String(body));
            }
        };
        // 绑定消费者，自动应答
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
