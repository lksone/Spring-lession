package com.demo.leecode;

import java.util.Random;

/**
 * @author lks
 * @date 2020-10-04 16:28
 * @email 1056224715@qq.com
 * @Description 微信红包随机算法
 */
public class RedBaoDemo {

    /**
     * 随机生成的红包数目和金额，其中注意最小的金额的数目为0.01
     *
     * @param redPackage 总金额的大小和总次数     剩余的钱数
     * @return
     */
    private static double getRedEven(RedPackage redPackage) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        Integer count = redPackage.getCount();
        Double totalMoney = redPackage.getTotalMoney();
        if (redPackage.getCount() == 1) {
            count--;
            return (double) Math.round(totalMoney * 100) / 100;
        }
        Random r = new Random();
        double min = 0.01;
        double max = totalMoney / count * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01 : money;
        money = Math.floor(money * 100) / 100;
        count--;
        totalMoney -= money;
        redPackage.setCount(count);
        redPackage.setTotalMoney(totalMoney);
        return money;
    }

    public static void main(String[] args) {
        RedPackage redPackag = new RedPackage();
        redPackag.setTotalMoney(1000d);
        redPackag.setCount(10);
        Double total = 0d;
        while (redPackag.getCount() > 0) {
            double redEven = getRedEven(redPackag);
            total += redEven;
            System.out.println(redEven);
        }
    }
}
