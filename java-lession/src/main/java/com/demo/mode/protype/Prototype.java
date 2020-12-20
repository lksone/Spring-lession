package com.demo.mode.protype;

import java.util.HashMap;
import java.util.Map;

public class Prototype implements Cloneable{

    private Integer fileid;

    private String fileidname;

    private Map<String,Double> scores;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
            //对复杂对象进行clone
            prototype.scores = (Map<String, Double>) ((HashMap)this.scores).clone();
        } catch (CloneNotSupportedException e) {

        }
        return prototype;
    }
}
