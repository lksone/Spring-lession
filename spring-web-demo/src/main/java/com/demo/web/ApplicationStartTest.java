package com.demo.web;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.catalina.LifecycleException;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;

/**
 * @author lks 123
 * @date 2020/10/25
 */
public class ApplicationStartTest {

    public static void main(String[] args) throws LifecycleException {
        TomcatDemo.run();
    }

    @Bean
    public HttpMessageConverters httpMessageCon() {
        return new HttpMessageConverters(new FastJsonHttpMessageConverter());
    }
}
