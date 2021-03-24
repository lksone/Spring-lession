package com.demo.mq.confirm;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;

import java.io.IOException;

/**
 * 项目提供者，confirm设置模式回调函数
 * <p>
 * 交换机的类型，发布订阅模式只能是 fanout
 */
public class ProviderDemo {

    /**
     * 设置队列名称
     */
    private static final String QUEUE_NAME = "queue_confirm_1";


    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection("/confirm");
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 开启confirm消息确认机制
        channel.confirmSelect();
        // 对消息的可达性进行监听，确认消息的签收情况，并作出相应的响应
        channel.addConfirmListener(new ConfirmListener() {
            /**
             * 消息回调函数
             * @param deliveryTag
             * @param multiple      是否是批量
             * @throws IOException
             */
            @Override
            public void handleAck(long deliveryTag, boolean multiple) throws IOException {
                System.out.println("消息发送成功..." + deliveryTag + "---" + multiple);
            }

            /**
             * 消息发送失败的回调
             *
             * @param deliveryTag
             * @param multiple
             * @throws IOException
             */
            @Override
            public void handleNack(long deliveryTag, boolean multiple) throws IOException {
                System.out.println("消息发送失败...执行相应的业务逻辑——重新发送...");
            }
        });
        //没有设置exchange
        String mesg = "\"confirm模式异步通信---\"";
        channel.basicPublish("", QUEUE_NAME, null, mesg.getBytes());
        //异步调用不能关闭》？？？
    }
}
