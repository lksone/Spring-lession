package com.demo.dependLoop;


import org.springframework.stereotype.Component;

@Component(value = "aBean")
public class ABean {

    private BBean b;

    public ABean() {
    }

    public BBean getB() {
        return b;
    }

    public void setB(BBean b) {
        this.b = b;
    }
}
