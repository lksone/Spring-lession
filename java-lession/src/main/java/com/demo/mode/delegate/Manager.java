package com.demo.mode.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String,Task> map = new HashMap<>();

    public Manager() {
        map.put("add",new ConcreteTaskA());
        map.put("put",new ConcreteTaskAB());
    }


    public void doing(String key){
        Task task = map.get(key);
        task.dowork();
    }
}
