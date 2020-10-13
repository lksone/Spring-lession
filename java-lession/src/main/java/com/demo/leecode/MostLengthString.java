package com.demo.leecode;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class MostLengthString {

    /**
     * 根据执行的字符串的长度获取到指定的不同的字符串的长度(暴力解法)
     *
     * @param target
     * @return
     */
    private static Integer getMostLength(String target) {
        if (StringUtils.isNotBlank(target)) {
            if (target.length() == 1) {
                return 1;
            }
            int start = 0;
            int max = 0;
            byte[] targetBytes = target.getBytes();
            //1.最外层循环数据
            Map<Byte, Integer> map = new HashMap<>();
            for (int i = 0; i < targetBytes.length; i++) {
                //当且仅当 数据存入
                if (map.containsKey(targetBytes[i])) {
                    //获取下标数据最大值,数目加上1
                    start = Math.max(start, map.get(targetBytes[i]) + 1);
                }
                //替换掉原来的下标值数据
                map.put(targetBytes[i], i);
                max = Math.max(max, i - start + 1);
            }
            return max;
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer a1rewfdssa = getMostLength("afddsaa");
        System.out.println(a1rewfdssa);
    }
}
