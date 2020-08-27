package com.demo.bean;

/**
 * @author Administrator
 */
public class SuperPerson extends Person {

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SuperPerson{" +
                "type=" + type +
                '}';
    }
}
