package com.demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/7/24 23:51
 */
@Slf4j
@SpringBootApplication
public class RedissionDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RedissionDemo.class, args);
        log.info("项目启动成功");
    }
}
