package com.demo.mq.worker;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerDemo {


    private static final String QUEUE_NAME = "queue_work_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.basicQos(2);
        // 声明消费者
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者1接受到的消息是：" + new String(body));
                //进行手动应答,手动获取到数据
                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        // 绑定消费者
        channel.basicConsume(QUEUE_NAME, false, defaultConsumer);
    }
}
