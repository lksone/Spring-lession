package com.demo.thread.base;


import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/28 22:26
 */
public class CASDemo {

    private static volatile int status = 0;

    //创建一个unsafe
    private static Unsafe unsafe = null;

    private static long stateOffset = 0;

    static {
        try {
            //使用反射获取成员变量theState的值
            Field field = Unsafe.class.getDeclaredField("unsafe");
            //设置域值为可存取
            field.setAccessible(true);
            //获取该变量field的值
            unsafe = (Unsafe) field.get(null);
            stateOffset = unsafe.objectFieldOffset(CASDemo.class.getDeclaredField("status"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void dosomething() {
        if (unsafe.compareAndSwapInt(this, stateOffset, 0, 1)) {
            System.out.println("成功輸出數據status" + status);
        }
    }

    public static void main(String[] args) {
        CASDemo demo = new CASDemo();
        if (unsafe.compareAndSwapInt(demo, stateOffset, 0, 1)) {
            System.out.println("成功輸出數據status" + status);
        }
    }
}
