package com.demo.rejection;

import com.demo.repository.PersonRespository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInfoDemo2 {


    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/spring-definine-rejection.xml");
        rejectionByName(beanFactory);
    }

    private static void rejectionByName(BeanFactory beanFactory) {
        PersonRespository bean = beanFactory.getBean(PersonRespository.class);

        System.out.println(beanFactory);
        //依赖注入
        System.out.println(bean.getBeanFactory());
        System.out.println(bean);
    }
}
