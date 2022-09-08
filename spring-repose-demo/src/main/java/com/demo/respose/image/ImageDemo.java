package com.demo.respose.image;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 10:29
 */
public class ImageDemo {

    public static void main(String[] args) throws IOException {
        String path = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\34.jpeg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        int read = bis.read();
        byte[] bte1 = new byte[1024];
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        while (bis.read(bte1) != -1) {
            bos.write(bte1, 0, 1);
        }
        byte[] bytes = "1231312".getBytes(StandardCharsets.UTF_8);
        bos.write(bytes);
        bos.close();
        bis.close();
    }


    /**
     * 获取文件头
     *
     * @param file   文件
     * @param length 长度
     * @return
     */
    private static String getFileHeader(byte[] file, int length) {
        if (null == file || file.length <= 0 || length > file.length) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int bt = file[i] & 0xFF;
            String str = Integer.toHexString(bt);
            if (str.length() < 2) {
                builder.append(0);
            }
            builder.append(str);
        }
        return builder.toString();
    }
}
