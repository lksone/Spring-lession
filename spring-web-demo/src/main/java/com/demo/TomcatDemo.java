package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * @author lks
 * @date 2020/10/25
 */
@Slf4j
public class TomcatDemo {

    public static void run() throws LifecycleException {
        //1 .创建一个tomcat的连接
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        tomcat.addWebapp("/", "D:\\lks");
        tomcat.start();
        tomcat.getServer().await();
    }
}
