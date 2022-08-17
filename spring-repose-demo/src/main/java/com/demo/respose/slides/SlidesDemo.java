package com.demo.respose.slides;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/11 18:00
 */
public class SlidesDemo {


    public static void main(String[] args) {
        String pText = "Hello MD5";
        System.out.println(DigestUtils.md5Hex(pText));
    }
}
