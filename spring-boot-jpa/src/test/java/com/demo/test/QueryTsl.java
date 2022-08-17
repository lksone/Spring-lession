package com.demo.test;

import com.demo.jpa.JpaApplication;
import com.demo.jpa.service.AccoutService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/4 21:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class QueryTsl {

    @Autowired
    private AccoutService accoutService;


    @Test
    public void method() {
        accoutService.findOne();
    }


    @Test
    public void method1() {
        accoutService.findOneMethod();
    }
}
