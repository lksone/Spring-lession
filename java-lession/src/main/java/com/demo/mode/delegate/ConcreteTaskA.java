package com.demo.mode.delegate;

public class ConcreteTaskA implements Task{


    @Override
    public void dowork() {
        System.out.println("A做的工作");
    }
}
