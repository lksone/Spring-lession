package com.demo.respose.utils;

import java.io.File;

/**
 * 获取Resource的路径的方法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/14 15:41
 */
public class ResourceUtil {

    private ResourceUtil() {
    }

    public static void function1(String fileName) {
        //注意getResource("")里面是空字符串
        String path = ResourceUtil.class.getClassLoader().getResource("").getPath();
        System.out.println(path);
        String filePath = path + fileName;
        System.out.println(filePath);
        File file = new File(filePath);
        System.out.println(file.exists());
    }

    public static void main(String[] args) {
        function1("a.docx");
    }
}
