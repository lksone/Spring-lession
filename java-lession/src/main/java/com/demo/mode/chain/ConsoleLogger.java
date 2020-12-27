package com.demo.mode.chain;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger.write"+message);
    }
}
