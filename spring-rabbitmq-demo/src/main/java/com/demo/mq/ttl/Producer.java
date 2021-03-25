package com.demo.mq.ttl;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 设置死信队列
 */
public class Producer {

    // ttl队列的交换机
    private static final String EXCHANGE_NAME_TTL = "exchange_ttl";
    // 路由的key
    private static final String ROUTING_KEY = "dlx.km";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection("/exchange");
        Channel channel = connection.createChannel();
        for (int i = 0; i < 5; i++) {
            channel.basicPublish(EXCHANGE_NAME_TTL, ROUTING_KEY, null, ("TTL队列测试死信队列" + i).getBytes());
        }
        channel.close();
        connection.close();
    }
}
