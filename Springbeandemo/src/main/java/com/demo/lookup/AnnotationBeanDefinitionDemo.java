package com.demo.lookup;

import com.demo.bean.SuperPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 通过注解的方式获取
 *
 * @author lks
 */
@Import(AnnotationBeanDefinitionDemo.ConfigDemo.class)
class AnnotationBeanDefinitionDemo {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AnnotationBeanDefinitionDemo.class);
        context.refresh();

        System.out.println(context.getBeansOfType(SuperPerson.class));

        System.out.println(context.getBeansOfType(ConfigDemo.class));

    }


    @Component
    public static class ConfigDemo {

        @Bean(name = "superPersonBean")
        public SuperPerson superPerson() {
            SuperPerson person = new SuperPerson();
            person.setType(1);
            person.setAge(1);
            person.setUsername("xiaoma");
            return person;
        }
    }
}
