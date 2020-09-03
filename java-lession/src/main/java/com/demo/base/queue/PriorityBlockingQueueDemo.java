package com.demo.base.queue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author lks
 * @Time 2020/9/3
 **/
public class PriorityBlockingQueueDemo {

    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //比較器的使用和對比
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(11,new CompDemo());
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(5);
        while (queue!=null){
            System.out.println(queue.take());
        }
    }
}


/**
 * 优先出队的条件
 */
class CompDemo implements Comparator<Integer>{

    /**
     *  数据比较的大小出队
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
