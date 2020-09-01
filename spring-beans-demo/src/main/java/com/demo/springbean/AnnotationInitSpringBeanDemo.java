package com.demo.springbean;

import com.demo.springbean.factory.DefaultPersonfactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过注解的方式初始化Bean
 *
 * @author Administrator
 */
public class AnnotationInitSpringBeanDemo {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.register(AnnotationInitSpringBeanDemo.class);
        annotationConfigApplicationContext.refresh();

        DefaultPersonfactory bean = annotationConfigApplicationContext.getBean(DefaultPersonfactory.class);
        System.out.println(bean);

        annotationConfigApplicationContext.close();
    }

    /**
     * 自定义的方式初始化 bean对象
     *
     * @return
     */
    @Bean(initMethod = "initSelf")
    public DefaultPersonfactory person() {
        return new DefaultPersonfactory();
    }
}
