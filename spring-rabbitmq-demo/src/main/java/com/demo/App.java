package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 */
@SpringBootApplication
@Slf4j
@EnableAsync
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class App {
    public static void main(String[] args) {
        ConfigurableEnvironment env = SpringApplication.run(App.class, args).getEnvironment();
        log.info(
                "\n----------------------------------------------------------\n\t" + "服务端 '{}' 启动完成! \n\t"
                        + "环境(s): {}\n\t" + "日志级别: {}" + "\n----------------------------------------------------------",
                env.getProperty("spring.application.name"), env.getActiveProfiles(),
                env.getProperty("logging.level.ROOT"));
    }
}
