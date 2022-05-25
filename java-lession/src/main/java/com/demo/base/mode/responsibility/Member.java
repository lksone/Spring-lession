package com.demo.base.mode.responsibility;

import lombok.Data;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 18:44
 */
@Data
public class Member {

    private String loginName;
    private String loginPass;
    private String roleName;


    public Member(){

    }
    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }
}
