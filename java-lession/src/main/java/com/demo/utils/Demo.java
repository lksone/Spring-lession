package com.demo.utils;

import org.jasypt.encryption.StringEncryptor;

public class Demo {

    public static void main(String[] args) {
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
