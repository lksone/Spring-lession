package com.demo.thread.base;

/**
 * @author lks
 * @describe 单例模式
 * @Email 1056224715@qq.com
 * @date 2020/12/24 14:29
 **/
public class SingtoneDemo {


    private static SingtoneDemo demo;

    private SingtoneDemo(){

    }

    /**
     * 获取数据
     * @return
     */
    public static SingtoneDemo getInstance(){
        if(demo == null){
            synchronized (SingtoneDemo.class){
                if(demo ==null){
                    demo = new SingtoneDemo();
                }
            }
        }
        return demo;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                SingtoneDemo instance = getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
