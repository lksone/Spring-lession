package com.demo.test;

import com.demo.jpa.JpaApplication;
import com.demo.jpa.entity.Account;
import com.demo.jpa.respository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/1 22:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class Demo {


    @Resource
    AccountRepository repository;

    @Test
    @Transactional
    public void contextLoads() {
        Integer byUsername = repository.findByUsername("123");
        System.out.println(byUsername);
    }

    @Test
    public void addAccount() {
        for (int i = 0; i < 10; i++) {
            Account account = new Account();
            account.setUsername("Admin1");
            account.setPassword("1234561");
            account = repository.save(account);  //返回的结果会包含自动生成的主键值
            System.out.println("插入时，自动生成的主键ID为：" + account.getId());
        }

    }
}
