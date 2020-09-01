package com.demo.springbean;

import com.demo.bean.Person;
import com.demo.bean.SuperPerson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        context.setConfigLocation("classpath:/META-INF/spring-bean-info.xml");

        Person bean = context.getBean(SuperPerson.class);
        System.out.println(bean);
        context.refresh();
    }
}
