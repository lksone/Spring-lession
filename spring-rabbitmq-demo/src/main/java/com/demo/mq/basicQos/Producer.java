package com.demo.mq.basicQos;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 消费者限流测试
 * 正常的发送到队列限流测试方法
 */
public class Producer {

    private static final String QUEUE_NAME = "queue_limit_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        for (int i = 0; i < 100; i++) {
            channel.basicPublish("", QUEUE_NAME, null, ("消费端限流策略—测试数据：" + i).getBytes());
        }
        channel.close();
        connection.close();
    }
}
