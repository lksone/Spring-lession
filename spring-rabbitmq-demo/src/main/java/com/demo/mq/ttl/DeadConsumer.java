package com.demo.mq.ttl;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class DeadConsumer {

    // dlx交换机
    private static final String EXCHANGE_NAME_DLX = "exchange_dlx";
    // dlx队列
    private static final String QUEUE_NAME_DLX = "queue_dlx";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection("/exchange");
        final Channel channel = connection.createChannel();
        // 创建topic模式交换机，开启持久化
        channel.exchangeDeclare(EXCHANGE_NAME_DLX, "topic", true);
        channel.queueDeclare(QUEUE_NAME_DLX, true, false, false, null);
        // 将队列和交换机进行绑定
        channel.queueBind(EXCHANGE_NAME_DLX, QUEUE_NAME_DLX, "dlx.#");
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("成功获取到数据：" + new String(body));
            }
        };
        channel.basicConsume(EXCHANGE_NAME_DLX, true, defaultConsumer);
    }
}
