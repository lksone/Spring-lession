package com.demo.jpa.service;

import com.alibaba.excel.util.StringUtils;
import com.demo.jpa.entity.Account;
import com.demo.jpa.entity.QAccount;
import com.demo.jpa.respository.AccountRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/4 22:18
 */
@Service
public class AccoutService {


    private final AccountRepository accountRepository;


    private final JPAQueryFactory jpaQueryFactory;

    @Autowired
    public AccoutService(AccountRepository accountRepository, JPAQueryFactory jpaQueryFactory) {
        this.accountRepository = accountRepository;
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public void findOne() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.Direction.DESC, "id");
        Page<Account> all = accountRepository.findAll(pageRequest);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("分頁信息：" + gson.toJson(all));

        Account account = new Account();
        account.setUsername("Admin12");
        Account username = accountRepository.findOne(new Specification<Account>() {
            @Override
            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                //条件集合
                List<Predicate> predicates = new ArrayList<Predicate>();
                //年龄精确匹配
                if (!StringUtils.isEmpty(account.getUsername())) {
                    predicates.add(criteriaBuilder.equal(root.get("username"), account.getUsername()));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
        System.out.println(username);
        Account account2 = new Account();
        account.setUsername("Admin1");
        List<Account> list = accountRepository.findAll(new Specification<Account>() {
            @Override
            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                //条件集合
                List<Predicate> predicates = new ArrayList<Predicate>();
                //年龄精确匹配
                if (!StringUtils.isEmpty(account.getUsername())) {
                    predicates.add(criteriaBuilder.equal(root.get("username"), account.getUsername()));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });

        System.out.println("--------------------------------------------------------------------");
        for (Account account1 : list) {
            System.out.println(account1);
        }
    }


    public void findOneMethod() {
        QAccount account = QAccount.account;
        List<Account> fetch = jpaQueryFactory.select(account).from(account).fetch();
        for (Account fetch1 : fetch) {
            System.out.println(fetch1);
        }
    }

}
