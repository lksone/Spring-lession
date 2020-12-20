package com.demo.base.object;

public class DeepClone implements Cloneable{

    private int num;

    private String name;

    public DeepClone(int num, String name) {
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
}
