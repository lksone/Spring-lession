package com.demo;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author lks
 * @Time 2020/8/25
 **/
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor:propertyDescriptors) {
            Class<?> propertyType = descriptor.getPropertyType();
            Method writeMethod = descriptor.getWriteMethod();
        }
    }
}
