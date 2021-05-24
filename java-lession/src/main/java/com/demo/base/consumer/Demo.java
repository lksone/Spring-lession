package com.demo.base.consumer;

import java.util.LinkedList;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/24 10:22
 * <p>
 * 生产者和消费者
 */
public class Demo {

    private LinkedList<String> linkedList = new LinkedList<>();

    private int capCity = 10;


    /**
     * 生产者
     */
    public void put(String value) {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                while (linkedList.size() == capCity) {
                    System.out.println("容器已经满了");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("没有满" + linkedList.size());
                linkedList.addLast(value);
                //唤醒所有的线程
                notifyAll();
            }
        }
    }

    /**
     * 消费者
     */
    public String take() {
        String value = null;
        while (true) {
            //这里获取线程是不释放的
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                while (linkedList.size() == 0) {
                    System.out.println("数据消费完了");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("剩余的个数" + linkedList.size());
                value = linkedList.removeFirst();
                notifyAll();
                return value;
            }
        }
    }


    public static void main(String[] args) {

    }

}
