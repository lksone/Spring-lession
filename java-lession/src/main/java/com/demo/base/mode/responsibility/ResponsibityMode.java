package com.demo.base.mode.responsibility;

/**
 *
 *
 * 责任链
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 18:43
 */
public class ResponsibityMode {


    public static void main(String[] args) {
        Member member = new Member();
        member.setLoginName("管理员");
        member.setLoginPass("12312");
        member.setRoleName("管理员");
        ValidateHandler.CheckHander checkHander = new ValidateHandler.CheckHander();
        ValidateHandler.AuthHandler authHandler = new ValidateHandler.AuthHandler();
        ValidateHandler.LoginHandler loginHandler = new ValidateHandler.LoginHandler();
        authHandler.next(checkHander).next(loginHandler).doHandler(member);
    }
}
