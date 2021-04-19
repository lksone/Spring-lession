package com.demo.dependLoop;

import org.springframework.stereotype.Component;

@Component(value = "b")
public class BBean {

    private ABean a;

    public BBean() {
    }

    public ABean getA() {
        return a;
    }

    public void setA(ABean a) {
        this.a = a;
    }
}
