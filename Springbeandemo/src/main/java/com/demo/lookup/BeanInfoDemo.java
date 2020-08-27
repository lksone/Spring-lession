package com.demo.lookup;

import com.demo.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.IntrospectionException;
import java.util.Map;

/**
 * @author lks
 * @Time 2020/8/25
 **/
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath*:META-INF/spring-bean-info.xml");
        /*beanInfoByName(beanFactory);*/
        /* beanInfoByFactory(beanFactory);*/
        /*beanInfoByType(beanFactory);*/
        beanInfoByMoreType(beanFactory);
    }

    private static void beanInfoByMoreType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory beanFactory1 = (ListableBeanFactory) beanFactory;
            Map<String, Person> beansOfType = beanFactory1.getBeansOfType(Person.class);

            System.out.println(beansOfType);

        }
    }

    /**
     * 单个数据获取
     *
     * @param beanFactory
     */
    private static void beanInfoByType(BeanFactory beanFactory) {
        Person bean = beanFactory.getBean(Person.class);
        System.out.println(bean);
    }

    /**
     * 延时查找数据
     *
     * @param beanFactory
     */
    private static void beanInfoByFactory(BeanFactory beanFactory) {
        ObjectFactory objectFactory = (ObjectFactory) beanFactory.getBean("objectFactory");
        Person object = (Person) objectFactory.getObject();
        System.out.println(object);
    }

    /**
     * 通过名称依赖查找(直接获取)实时查找数据
     *
     * @param beanFactory
     */
    private static void beanInfoByName(BeanFactory beanFactory) {
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}
