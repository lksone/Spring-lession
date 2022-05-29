package com.demo.thread.stop;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * 布隆过滤器
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/29 19:06
 */
public class BooleanFilterDemo {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // 总数量
        int total = 1000000;
        // 默认误判率fpp0.03
        BloomFilter<CharSequence> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total);
        // 初始化 total 条数据到过滤器中
        for (int i = 0; i < total; i++) {
            bf.put("" + i);
        }
        // 判断值是否存在过滤器中
        int count = 0;
        for (int i = 0; i < total + 10000; i++) {
            if (bf.mightContain("" + i)) {
                count++;
            }
        }
        // (1000309 - 1000000)/(1000000 + 10000) * 100 ≈ 0.030594059405940593
        System.out.println("已匹配数量 " + count);

        //指定误判率：万分之一，提高匹配精度
        BloomFilter<CharSequence> bfWithFpp = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total, 0.0001);
        for (int i = 0; i < total; i++) {
            bfWithFpp.put("" + i);
        }
        int countFpp = 0;
        for (int i = 0; i < total + 10000; i++) {
            if (bfWithFpp.mightContain("" + i)) {
                countFpp++;
            }
        }
        //误判率 fpp 的值越小，匹配的精度越高。当减少误判率 fpp 的值，需要的存储空间也越大，所以在实际使用过程中需要在误判率和存储空间之间做个权衡。
        // (1000001 - 1000000)/(1000000 + 10000) * 100 ≈ 0.0001
        System.out.println("指定误判率已匹配数量 " + countFpp);
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
