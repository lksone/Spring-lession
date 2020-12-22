package com.demo.mode.delegate;

public class MemberController {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Boss boss = new Boss();
        boss.command("add",manager);
    }
}
