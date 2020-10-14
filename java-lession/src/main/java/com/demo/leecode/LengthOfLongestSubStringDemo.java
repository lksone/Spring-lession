package com.demo.leecode;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lks
 * @describe 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @date 2020/10/12 09:36
 **/
public class LengthOfLongestSubStringDemo {

    /**
     * 获取字符串最长值
     *
     * @param target      目标str
     * @return            最长的字符串长度
     */
    private static Integer LengthOfLongestSubString(String target){
        if(StringUtils.isBlank(target)){
            throw new NullPointerException("target is not null");
        }
        if(target.length() == 1){
            return 1;
        }
        //最长字符串的起始下标长度,起始坐标
        int index = 0;
        int maxLength = 0;
        byte[] bytes = target.getBytes();
        //存儲最長的目標字符和下标(其中map中的key不能重複)
        Map<Byte,Integer> map = new HashMap<>();
        for (int i = 0; i < bytes.length; i++) {
            if(map.containsKey(bytes[i])){
                index = Math.max(index,map.get(bytes[i])+1);
            }
            map.put(bytes[i],i);
            maxLength = Math.max(maxLength,i-index +1);
        }
        return maxLength;
    }

    /**
     * 获取最长长度通过左右指针
     *
     * @param s
     * @return
     */
    private static int getLengthOfLongestStr(String s){
        int start,end,max;
        return 0;
    }

    public static void main(String[] args) {
        Integer abcabcbb = LengthOfLongestSubString("pwwkewaaswqfrgs");
        System.out.println(abcabcbb);
    }
}
