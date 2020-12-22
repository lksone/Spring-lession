package com.demo.mode.delegate;

public class Boss {

    void command(String command,Manager manager){
        manager.doing(command);
    }
}
