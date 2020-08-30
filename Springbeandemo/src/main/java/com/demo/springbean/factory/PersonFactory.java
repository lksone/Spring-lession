package com.demo.springbean.factory;

import com.demo.bean.Person;

public interface PersonFactory {

    default Person create() {

        return new Person();
    }
}
