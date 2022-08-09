package com.demo.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/9 22:03
 */
@Configuration
public class PropertiesConfig {


    @Bean
    public Properties getProperties(){
        Properties properties = new Properties();
        properties.setProperty("name","lks");
        return properties;
    }
}
