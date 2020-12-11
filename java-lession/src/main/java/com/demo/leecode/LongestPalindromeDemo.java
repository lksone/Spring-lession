package com.demo.leecode;

/**
 * @author lks
 * @describe 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * @date 2020/10/12 16:37
 **/
public class LongestPalindromeDemo {

    /**
     * 獲取最長回文字符串
     * @param target
     * @return
     */
    public static String longestPalindrome(String target){
        if(target==null || "".equals(target)){
            return "";
        }

        String maxStr = "";
        char[] charArray = target.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int leftStr = getMaxLength(target,i,i);
            int OSStr = getMaxLength(target,i,i+1);
            int maxLen = Math.max(leftStr,OSStr);
            if(maxLen > maxStr.length()){
                maxStr = target.substring(i,maxLen);
            }
        }
        return maxStr;
    }

    /**
     * 獲取最長子串
     *
     * @param target        目标str
     * @param left
     * @param right
     * @return
     */
    public static int getMaxLength(String target,int left,int right){
        while (left>0 && right<target.length() && target.charAt(left) == target.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static void main(String[] args) {
        String target ="abasfdacdas";
        String s = longestPalindrome(target);
        System.out.println(s);
    }
}
