package com.demo.base.mode.responsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 18:51
 */
public class ValidateHandler{

    public ValidateHandler() {
    }

    /**
     * 登录校验
     */
    static class CheckHander extends Handler{
        @Override
        public void doHandler(Member member) {
            if (StringUtils.isEmpty(member.getLoginName()) ||
                    StringUtils.isEmpty(member.getLoginPass())) {
                System.out.println("用户名和密码为空");
                return;
            }
            System.out.println("用户名和密码不为空，可以往下执行");
            next.doHandler(member);
        }
    }

    /**
     * 登录接口
     */
    static class LoginHandler extends Handler {
        @Override
        public void doHandler(Member member) {
            System.out.println("登录成功！");
            member.setRoleName("管理员");
            next.doHandler(member);
        }
    }

    /**
     * 权限校验
     */
    static class AuthHandler extends Handler {
        @Override
        public void doHandler(Member member) {
            if (!"管理员".equals(member.getRoleName())) {
                System.out.println("您不是管理员，没有操作权限");
                return;
            }
            System.out.println("允许操作");
        }
    }
}
