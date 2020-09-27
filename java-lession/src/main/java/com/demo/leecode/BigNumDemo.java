package com.demo.leecode;

/**
 * @author lks
 * @describe 大数据相加
 * @date 2020/9/27 17:14
 **/
public class BigNumDemo {


    public static void main(String[] args) {
        System.out.println(bigNumAdd("131221312312321321","-14324231"));
    }

    /**
     *  超大數相加
     *
     * @param one       第一个数
     * @param two       第二个数
     * @return
     */
    public static String bigNumAdd(String one,String two){
        String result = "";
        // 1. 將数据类型转换成指定的方式 字节 注意字节的方式是 0 -19都是连续的一种方式和方法
        char[] a = new StringBuffer(one).reverse().toString().toCharArray();
        char[] b = new StringBuffer(two).reverse().toString().toCharArray();
        int lenA = a.length;
        int lenB = b.length;
        // 2. 获取最长的数据
        int len = lenA >lenB ? lenA : lenB;
        // 3. 所有數據相加的結果數據
        int[] results = new int[len+1];
        for (int i = 0; i <= len; i++) {
            //短的数据用0填充
            int aint = i < lenA ? (a[i] -'0'):0;
            int bint = i< lenB ? (b[i] -'0'):0;
            results[i] = aint + bint;
        }
        //4.對數據進行取模，也就是說將数组中的所有的数据进行同位加法运算
        for (int i = 0; i < results.length; i++) {
            if(results[i] >=10){
                results[i+1] = results[i+1] + results[i]/10;
                results[i] = results[i] % 10;
            }
        }
        // 大於10的數字获取他的长度

        StringBuffer sb = new StringBuffer();
        Boolean falg = true;
        for (int i = results.length; i >= 0; i--) {
            if(results[i] == 0 && falg){
                continue;
            }else{
                falg = true;
            }
        }
        return sb.toString();
    }

    public String bigNuberMulti(String a,String b) {
        //数据相减
        return "";
    }
}
