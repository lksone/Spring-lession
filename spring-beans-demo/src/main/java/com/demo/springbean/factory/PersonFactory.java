package com.demo.springbean.factory;

import com.demo.bean.Person;

/**
 * @author lks
 */
public interface PersonFactory {

    /**
     * 创建对象
     *
     * @return
     */
    default Person create() {
        return new Person();
    }
}
