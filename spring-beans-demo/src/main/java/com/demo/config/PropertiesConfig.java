package com.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/9 22:36
 */
@Configuration
public class PropertiesConfig {

    @Bean
    public PropertyPlaceholderConfigurer properties() {


        final PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setIgnoreResourceNotFound(true);
        final List<Resource> resourceLst = new ArrayList<Resource>();
        resourceLst.add(new ClassPathResource("my.properties"));
        ppc.setLocations(resourceLst.toArray(new Resource[]{}));
        return ppc;
    }

    @Component
    public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
        public MyPropertyPlaceholderConfigurer() {
            this.setIgnoreResourceNotFound(true);
            final List<Resource> resourceLst = new ArrayList<Resource>();
            resourceLst.add(new ClassPathResource("my.properties"));
            this.setLocations(resourceLst.toArray(new Resource[]{}));
        }
    }

    @Value("abc.d")
    private String test;


}
