package com.demo.mq.return1;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ReturnListener;

import java.io.IOException;

public class Producer {

    private static final String EXCHANGE_NAME = "exchange_return_1";
    // 可以路由的key
    private static final String ROUTING_KEY = "return.save";
    // 不能路由的key
    private static final String ROUTING_KEY_ERROR = "km.save";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        // 添加return监听机制(主要的方法)
        channel.addReturnListener(new ReturnListener() {
            /**
             *  监听的回调方法
             * @param replyCode 队列响应给浏览器的状态码
             * @param replyText 状态码对应的文本信息
             * @param exchange  交换机的名称
             * @param routingKey 路由的key
             * @param properties 消息的相关属性
             * @param body  消息体的内容
             */
            @Override
            public void handleReturn(int replyCode, String replyText, String exchange, String routingKey, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("===================================================================");
                System.out.println("监听到不可达消息..." + new String(body));
                System.out.println("状态码：" + replyCode + "  文本信息为：" + replyText);
                System.out.println("交换机的名字为：" + exchange + "  路由的key为：" + routingKey);
                System.out.println("相关属性：" + properties);
            }
        });
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // mandatory 属性设置为true表示：要监听不可达的消息
                channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, true, null, ("return监听机制" + i).getBytes());
            } else {
                channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY_ERROR, true, null, ("return监听机制" + i).getBytes());
            }
        }
    }
}
