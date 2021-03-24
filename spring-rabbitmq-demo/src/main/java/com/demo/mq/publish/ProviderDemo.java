package com.demo.mq.publish;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 项目提供者，direct模式
 * <p>
 * 交换机的类型，发布订阅模式只能是 fanout
 */
public class ProviderDemo {


    // 声明交换机的名字
    private static final String EXCHANGE_NAME = "exchange_publish_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        // 声明交换机
        /**
         *  param1：exchange，交换机的名称
         *  param2：type，交换机的类型，发布订阅模式只能是 fanout
         */
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        // 发送消息到交换机
        for (int i = 0; i < 100; i++) {
            channel.basicPublish(EXCHANGE_NAME, "", null, ("发布订阅模型的第 " + i + " 条消息").getBytes());
        }
        // 关闭资源
        channel.close();
        connection.close();
    }
}
