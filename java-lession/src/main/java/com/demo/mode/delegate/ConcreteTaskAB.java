package com.demo.mode.delegate;

public class ConcreteTaskAB implements Task{
    @Override
    public void dowork() {
        System.out.println("b做的工作");
    }
}
