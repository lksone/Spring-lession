package com.demo.leecode.base;

/**
 *
 * 进制计算
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/16 17:39
 */
public class ConvertToBase7 {

    /**
     * 转换七进制
     */
    public static void base7(){
        int num = -77;
        String number = null;
        if (num == 0) {
            number = "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuffer digits = new StringBuffer();
        while (num > 0) {
            digits.append(num % 7);
            num /= 7;
        }
        if (negative) {
            digits.append('-');
        }
        //直接調換位置
        System.out.println(digits.reverse().toString());
    }


    public static String resve7(int num,int digConvert){
        if(num == 0){
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        while (num > 0){
            sb.append(num%digConvert);
            num/=digConvert;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        base7();
    }
}
