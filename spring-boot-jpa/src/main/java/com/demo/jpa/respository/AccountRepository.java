package com.demo.jpa.respository;

import com.demo.jpa.entity.Account;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/1 22:29
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account> {

    @Query("SELECT id FROM Account WHERE username = ?1")
    Integer findByUsername(String username);

   // Account findOne(Specification<Account> accountSpecification);

    List<Account> findAll(Specification<Account> username);
}
