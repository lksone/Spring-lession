package com.demo.springbean.respository;

import javax.annotation.PostConstruct;

/**
 * @author lks
 */
public class PersonRespository {


    @PostConstruct
    public void init() {
        System.out.println("PersonRespository.init");
    }
}
