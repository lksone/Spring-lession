package com.demo.leecode.base;

/**
 *
 * 斐波那契函数
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/27 11:02
 */
public class Fibonacci {

    /**
     * 斐波那切函數（最差）
     *
     * @param n
     * @return
     */
    public static int fib(int n){
      if(n == 0 || n == 1){
          return n;
      }else{
         return fib(n-1) + fib(n-2);
      }
    }

    /**
     * 斐波那契函数
     *
     * @param n
     * @return
     */
    public static int fib1(int n){
        if(n==0||n==1){
            return n;
        }
        int a = 0, b = 1, sum=a+b;
        for(int i = 2; i < n; i++){
            a = b;
            b = sum;
            sum = (a + b) % 1000000007;
        }
        return sum;
    }

    public static void main(String[] args) {
        int fib = fib1(7);
        System.out.println(fib);
    }
}
