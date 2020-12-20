package com.demo.base.object;


/**
 * 淺克隆是
 *  指拷贝对象时仅仅拷贝对象本身（包括对象中的基本变量），而不拷贝对象包含的引用指向的对象
 */
public class ShowllowClone implements Cloneable{

    private int num;

    private String name;

    public ShowllowClone(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShowllowClone c = new ShowllowClone(1,"age");
        ShowllowClone clone = (ShowllowClone)c.clone();
        System.out.println(c.equals(clone));

        System.out.println(c.getName().equals(clone.getName()));

        //對象中的值是用一個地址引用
        System.out.println(c.getNum());
    }
}
