package com.demo.exception;

/**
 * @author lks
 * @Time 2020/9/1
 **/
public class ClassNotFundExceptionDemo {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
