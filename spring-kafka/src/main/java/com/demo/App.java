package com.demo;

import com.demo.kafka.producer.HelloProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.kafka.annotation.EnableKafka;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
@Slf4j
@EnableKafka
@EnableAutoConfiguration
@SpringBootApplication
public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        ConfigurableEnvironment env = context.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        log.info("当前URI:{}", path + ":" + port);

        HelloProducer bean = context.getBean(HelloProducer.class);
        for (int i = 10; i < 20; i++) {
            TimeUnit.MICROSECONDS.sleep(10);
            bean.syncSend(i);
        }
    }
}
