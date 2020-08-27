package com.demo.repository;

import com.demo.bean.Person;
import org.springframework.beans.factory.BeanFactory;

import java.util.Collection;

/**
 * @author Administrator
 */
public class PersonRespository {

    private Collection<Person> list;


    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    private BeanFactory beanFactory;

    public Collection<Person> getList() {
        return list;
    }

    public void setList(Collection<Person> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PersonRespository{" +
                "list=" + list +
                '}';
    }
}
