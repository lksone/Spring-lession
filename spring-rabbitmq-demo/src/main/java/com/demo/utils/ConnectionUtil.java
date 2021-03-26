package com.demo.utils;


import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;


/**
 * 通过项目信息获取项目信息
 */
public class ConnectionUtil {

    /**
     * 设置不同的mq信息
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        factory.setUsername("guest");
        factory.setPassword("guest");
        Connection connection = factory.newConnection();
        return connection;
    }

    /**
     * 根据不同的项目信息获取不同的group下的问题
     *
     * @param vHost         綁定vhost
     * @return
     * @throws Exception
     */
    public static Connection getConnection(String vHost) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setVirtualHost(vHost);
        factory.setUsername("guest");
        factory.setPassword("guest");
        Connection connection = factory.newConnection();
        return connection;
    }
}
