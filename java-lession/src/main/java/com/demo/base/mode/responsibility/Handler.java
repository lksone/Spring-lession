package com.demo.base.mode.responsibility;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 18:48
 */
public abstract class Handler {

    protected Handler next;

    public Handler next(Handler next){ this.next = next;return this;}

    /**
     * 我们公用的一种方式方法
     * @param member
     */
     abstract void doHandler(Member member);
}
