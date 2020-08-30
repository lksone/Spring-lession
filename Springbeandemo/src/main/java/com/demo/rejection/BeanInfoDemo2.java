package com.demo.rejection;

import com.demo.ann.Super;
import com.demo.bean.SuperPerson;
import com.demo.repository.PersonRespository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInfoDemo2 {


    public static void main(String[] args) {
        // BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/spring-definine-rejection.xml");
        //  rejectionByName(beanFactory);

        // rejectionBySuperName(beanFactory);

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Super.class);
        SuperPerson bean = annotationConfigApplicationContext.getBean(SuperPerson.class);
        System.out.println(bean);
    }


    private static void rejectionBySuperName(BeanFactory beanFactory) {
        SuperPerson bean = beanFactory.getBean(SuperPerson.class);

        System.out.println(bean);
    }

    private static void rejectionByName(BeanFactory beanFactory) {
        PersonRespository bean = beanFactory.getBean(PersonRespository.class);

        System.out.println(beanFactory);
        //依赖注入
        System.out.println(bean.getBeanFactory());
        System.out.println(bean);
    }
}
