package com.demo.mq.topic;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;

/**
 * 项目提供者，topic模式
 * <p>
 * 交换机的类型，发布订阅模式只能是 fanout
 */
public class ProviderDemo {

    //设置exchange
    private static final String EXCHANGE_NAME = "exchange_topic_1";

    private static final String EXCHANGE_ROUTING_KEY1 = "topic.km";

    private static final String EXCHANGE_ROUTING_KEY2 = "topic.km.001";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        for (int i = 0; i < 100; i++) {
            // topic在路由模型的基础上，只有路由的key发生改变，其余的都不变
            if (i % 2 == 0) {
                channel.basicPublish(EXCHANGE_NAME, EXCHANGE_ROUTING_KEY1, MessageProperties.PERSISTENT_TEXT_PLAIN, ("topic模型发送的第 " + i + " 条信息").getBytes());
            } else {
                channel.basicPublish(EXCHANGE_NAME, EXCHANGE_ROUTING_KEY2, MessageProperties.PERSISTENT_TEXT_PLAIN, ("topic模型发送的第 " + i + " 条信息").getBytes());
            }
        }
        channel.close();
        connection.close();
    }
}
