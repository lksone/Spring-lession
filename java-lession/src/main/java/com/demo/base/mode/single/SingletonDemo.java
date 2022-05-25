package com.demo.base.mode.single;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/24 09:24
 * <p>
 * 单例模式
 */
public class SingletonDemo {

    private static volatile SingletonDemo instance = null;

    private SingletonDemo() { }

    public static SingletonDemo getInstance() {
        //如果instance为null的话就直接huo
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                instance = new SingletonDemo();
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
}
