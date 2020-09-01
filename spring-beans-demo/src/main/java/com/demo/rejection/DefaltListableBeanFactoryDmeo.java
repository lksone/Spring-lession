package com.demo.rejection;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author lks
 * @Time 2020/8/28
 **/
public class DefaltListableBeanFactoryDmeo {

    public static void main(String[] args) {
        // 1.get resources
        ClassPathResource resource = new ClassPathResource("classpath:/META-INF/spring-bean-info.xml");
        // 2.create beanDefine Factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 3. xml的reader的
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
    }
}
