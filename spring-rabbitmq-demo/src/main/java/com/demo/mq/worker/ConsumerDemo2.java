package com.demo.mq.worker;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo2 {

    private static final String QUEUE_NAME = "queue_work_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //人为设置最大的消费个数
        channel.basicQos(1);
        // 声明消费者
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("消费者2接受到的消息是：" + new String(body));
                //进行手动应答
                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        // 绑定消费者
        channel.basicConsume(QUEUE_NAME, false, defaultConsumer);
    }
}
