package com.demo.jpa.service;

import com.demo.jpa.entity.Account;
import com.demo.jpa.respository.AccountRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/4 22:18
 */
@Service
public class AccoutService {


    @Autowired
    private AccountRepository accountRepository;

    public void findOne() {
        PageRequest pageRequest = PageRequest.of(0,10,Sort.Direction.DESC,"id");
        Page<Account> all = accountRepository.findAll(pageRequest);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("分頁信息："+ gson.toJson(all));
    }

}
