package com.demo.base.mode.strategy;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 21:21
 */
public class GuestMedalServiceImpl implements Strategy{

    @Override
    public void showMedal() {
        System.out.println("嘉宾");
    }
}
