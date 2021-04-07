package com.demo.mq.confirm;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo2 {

    private static final String QUEUE_NAME = "queue_confirm_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection("/confirm");
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者接收的消息是：" + new String(body));
                // 手动应答
                channel.basicAck(envelope.getDeliveryTag(), false);
                /**
                 *  该方法的作用是：拒绝接收消息，服务器会拒绝指定了 delivery_tag 的所有未确认的消息
                 *  param1: deliveryTag，消息的id
                 *  param2: multiple，是否是批量
                 *      true: 批量，会拒绝所有 deliveryTag 小于当前deliveryTag的消息
                 *      false: 只会拒绝 deliveryTag 一致的消息
                 *  param3: requeue，
                 *      true：表示拒收消息后将消息重新放入队列
                 *      false：表示拒收消息后删除该消息
                 */
                channel.basicNack(envelope.getDeliveryTag(), false, true);
            }
        };
        channel.basicConsume(QUEUE_NAME, false, defaultConsumer);
        channel.waitForConfirmsOrDie(1000);
    }
}