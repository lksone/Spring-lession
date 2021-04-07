package com.demo.mq.basicQos;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * 当前的数据不能够一次性发送设置每次发送5个并发量
 */
public class Consumer2 {

    private static final String QUEUE_NAME = "queue_limit_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        /**  设置限流机制
         *  param1: prefetchSize，消息本身的大小 如果设置为0  那么表示对消息本身的大小不限制
         *  param2: prefetchCount，告诉rabbitmq不要一次性给消费者推送大于N个消息
         *  param3：global，是否将上面的设置应用于整个通道，false表示只应用于当前消费者
         */
        channel.basicQos(0, 5, false);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者2接收到信息：" + new String(body));
                channel.basicAck(envelope.getDeliveryTag(), false);
               /* try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };
        channel.basicConsume(QUEUE_NAME, false, defaultConsumer);
    }
}
