package com.demo.springbean;

import com.demo.bean.Person;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * @author lks
 */
public class ObjectProviderDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.register(ObjectProviderDemo.class);
        annotationConfigApplicationContext.refresh();

        getBeanProviderInfo(annotationConfigApplicationContext);


        Map<String, Person> beansOfType = annotationConfigApplicationContext.getBeansOfType(Person.class);

        annotationConfigApplicationContext.close();
    }

    private static void getBeanProviderInfo(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        ObjectProvider<Person> beanProvider = annotationConfigApplicationContext.getBeanProvider(Person.class);
        System.out.println(beanProvider.getIfAvailable());
    }


    @Bean
    Person person() {
        Person person = new Person();
        person.setUsername(";lkd");
        person.setAge(12);
        return person;
    }
}
