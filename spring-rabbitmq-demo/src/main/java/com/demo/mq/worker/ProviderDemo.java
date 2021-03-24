package com.demo.mq.worker;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.util.concurrent.TimeUnit;

/**
 * 项目提供者，worker工作模式
 * <p>
 * 交换机的类型，worker的工作方式是有且只有一个消费
 */
public class ProviderDemo {


    /**
     * 设置交换机的名称
     */
    private static final String QUEUE_NAME = "queue_work_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 发送消息到交换机
        for (int i = 0; i < 100; i++) {
            TimeUnit.SECONDS.sleep(1);
            channel.basicPublish("", QUEUE_NAME, null, ("worker工作模式 " + i + " 条消息").getBytes());
        }
        // 关闭资源
        channel.close();
        connection.close();
    }
}
