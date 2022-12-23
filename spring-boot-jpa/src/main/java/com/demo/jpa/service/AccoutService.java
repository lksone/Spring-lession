package com.demo.jpa.service;

import com.demo.jpa.entity.Account;
import com.demo.jpa.entity.QAccount;
import com.demo.jpa.respository.AccountRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

/*    public void findOne() {
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
    }*/


    public void findOneMethod() {
        QAccount account = QAccount.account;
        List<Account> fetch = jpaQueryFactory.select(account).from(account).fetch();
        for (Account fetch1 : fetch) {
            System.out.println(fetch1);
        }
    }


    public void findSort() {
        PageRequest pageRequest = PageRequest.of(0, 100, Sort.Direction.DESC, "createTime");
        Page<Account> all = accountRepository.findAll(pageRequest);
        List<Account> content = all.getContent();
        for (Account a : content) {
            System.out.println(a);
        }
    }

    /**
     * 获取当前天数的30天前的数据
     *
     * @return
     */
    private Date getDate30() {
        //能拿到推后30天时间的代码
        //获取系统当前时间
        Calendar currentdate = Calendar.getInstance();
        //在这里进行加30天（ps:周六周日也算在里边了）
        currentdate.add(Calendar.DATE, -30);
        //得到最后的时间
        return currentdate.getTime();
    }

    /**
     *
     * 小于当前前30天的数据信息，并且是前100名数据信息进行删除
     *
     * 作者：VeggieOrz
     * 链接：https://juejin.cn/post/6985573675764285477
     * 来源：稀土掘金
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public void findSort2() {
        Date date = getDate30();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
        Specification<Account> spec = new Specification<Account>() {
            @Override
            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Path<Account> path = root.get("createTime");
                //创建时间小于等于30天
                Predicate equal = criteriaBuilder.lessThanOrEqualTo(path.as(Date.class), date);
                return equal;
            }
        };

        Integer pageNo = 0;
        Integer pageSize = 100;
        /**
         * 添加排序Sort
         *      Sort.Direction.DESC表示降序
         *      Sort.Direction.ASC表示升序
         *      properties是指实体类的属性名（不是字段名）
         */
        /**
         *  分页参数Pageable
         *      参数1：查询的页码
         *      参数2：每页查询的条数
         *      参数3：查询结果的排序规则（可选
         */
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.Direction.DESC, "createTime");
        /**
         *  分页查询
         *      参数1：查询条件Specification
         *      参数2：分页参数Pageable
         */

        Page<Account> all = accountRepository.findAll(spec, pageable);
        List<Account> content = all.getContent();
        for (Account account : content) {
            System.out.println(account);
        }

    }

}
