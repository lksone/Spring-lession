package com.demo.apollo;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/apollo/test")
public class ApolloController {

    @Value("${test.input}")
    private String input;


    /**
     * 设置apolloConfig获取配置中的数据
     */
    @ApolloConfig
    private Config config;

    @GetMapping("/config/getUserName3")
    public String getUserName3() {
        return config.getProperty("test.input", "yinjihuan");
    }
}
