package com.demo.utils;

import org.jasypt.encryption.StringEncryptor;
import org.reflections.Reflections;

public class Demo {

    public static void main(String[] args) {
        Reflections reflections = new Reflections();
        StringEncryptor encryptor = new StringEncryptor() {
            @Override
            public String encrypt(String s) {
                return null;
            }

            @Override
            public String decrypt(String s) {
                return null;
            }
        };
    }
}
