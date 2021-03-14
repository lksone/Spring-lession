package com.demo.thread.stop;

public class SynchronizedObject {

    private String name = "a";

    private String password = "aa";

    public synchronized void printString(String name, String password) {
        try {
            this.name = name;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
