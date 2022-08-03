package com.demo.jpa.respository;

import com.demo.jpa.entity.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/1 22:29
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

    @Query("SELECT id FROM Account WHERE username = ?1")
    Integer findByUsername(String username);
}
