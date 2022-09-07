package com.demo.respose.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/11 18:44
 */
public class MD5Util {

    private static  Charset UTF_8 = StandardCharsets.UTF_8;
    private static  String OUTPUT_FORMAT = "%-20s:%s";

    private static byte[] digest(byte[] input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
        byte[] result = md.digest(input);
        return result;
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }


    public static String md5ToString(String password){
         MessageDigest md;
         try {
             md = MessageDigest.getInstance("MD5");
             md.update(password.getBytes(UTF_8));
             byte[] bPwd=md.digest();
             String pwd = new BigInteger(1, bPwd) .toString(16);
             if(pwd.length()%2 == 1){
                 pwd="0"+pwd;
             }
             int length=pwd.length();
                StringBuffer sb=new StringBuffer(length+length/2-1);
              for(int i=0;i<length;i+=2){
                  sb.append(pwd.substring(i, i+2));
                  if(i+2<length) {
                      sb.append("-");
                  }
              }
              return sb.toString().toUpperCase();
            } catch (Exception e) {
                e.printStackTrace();
         }
          return password;
    }
    public static void main(String[] args) {

        String pText = "hello world";
        System.out.println(DigestUtils.md5Hex(pText));
        System.out.println(md5ToString(pText));

    }
}
