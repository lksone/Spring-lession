package com.demo.mq.ttl;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Consumer {

    // ttl队列的交换机
    private static final String EXCHANGE_NAME_TTL = "exchange_ttl";
    // ttl队列
    private static final String QUEUE_NAME_TTL = "queue_ttl";
    // dlx交换机
    private static final String EXCHANGE_NAME_DLX = "exchange_dlx";
    // dlx队列
    private static final String QUEUE_NAME_DLX = "queue_dlx";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection("/exchange");
        final Channel channel = connection.createChannel();
        // 创建topic模式交换机，开启持久化
        channel.exchangeDeclare(EXCHANGE_NAME_TTL, "topic", true);
        Map<String, Object> map = new HashMap<>();
        map.put("x-message-ttl", 10000);
        map.put("x-dead-letter-exchange", EXCHANGE_NAME_DLX);
        channel.queueDeclare(QUEUE_NAME_TTL, true, false, false, map);
        // 将队列和交换机进行绑定
        channel.queueBind(QUEUE_NAME_TTL, EXCHANGE_NAME_TTL, "dlx.#");

        // 开始声明死信交换机和死信队列
        // 添加一个死信的属性  后面这个值就是死信队列交换机的名字
        channel.exchangeDeclare(EXCHANGE_NAME_DLX, "topic", true);
        channel.queueDeclare(QUEUE_NAME_DLX, true, false, false, null);
        channel.queueBind(QUEUE_NAME_DLX, EXCHANGE_NAME_DLX, "#");

        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("成功获取到数据：" + new String(body));
            }
        };
        channel.basicConsume(QUEUE_NAME_TTL, true, defaultConsumer);
    }
}
