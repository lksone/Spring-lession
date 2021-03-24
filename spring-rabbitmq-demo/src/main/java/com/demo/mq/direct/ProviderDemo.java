package com.demo.mq.direct;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 项目提供者，direct模式
 * <p>
 * 交换机的类型，发布订阅模式只能是 fanout
 */
public class ProviderDemo {


    private static final String EXCHANGE_NAME = "exchange_direct_1";
    // 定义路由的key，key值是可以随意定义的
    private static final String EXCHANGE_ROUTING_KEY1 = "direct_km1";

    private static final String EXCHANGE_ROUTING_KEY2 = "direct_km2";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        //设置不同的routing值发送到不同的路由上面
        for (int i = 0; i < 100; i++) {
            //设置到同一个交换机上绑定的是不同的rounting key
            if (i % 2 == 0) {
                channel.basicPublish(EXCHANGE_NAME, EXCHANGE_ROUTING_KEY1, null, ("A路由模型发送的第 " + i + " 条信息").getBytes());
            } else {
                channel.basicPublish(EXCHANGE_NAME, EXCHANGE_ROUTING_KEY2, null, ("B路由模型发送的第 " + i + " 条信息").getBytes());
            }
        }
        channel.close();
        connection.close();
    }
}
