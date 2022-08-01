package com.demo.test;

import com.demo.jpa.entity.Account;
import com.demo.jpa.respository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/1 22:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Demo {


    @Resource
    private AccountRepository repository;

    @Test
  public   void contextLoads() {
        //直接根据ID查找
        repository.findById(1).ifPresent(System.out::println);
    }

    @Test
    public  void addAccount(){
        Account account = new Account();
        account.setUsername("Admin");
        account.setPassword("123456");
        account = repository.save(account);  //返回的结果会包含自动生成的主键值
        System.out.println("插入时，自动生成的主键ID为："+account.getId());
    }
}
