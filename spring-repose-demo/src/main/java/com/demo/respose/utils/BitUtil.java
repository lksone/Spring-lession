package com.demo.respose.utils;

import java.nio.charset.StandardCharsets;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/31 11:11
 */
public class BitUtil {

    /**
     * @param target
     * @return
     */
    public static String chineseToBinary(String target) {
        byte[] nn = String.valueOf(target).getBytes(StandardCharsets.UTF_8);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nn.length; i++) {
            byte ss = nn[i];
            sb.append(Integer.toBinaryString((Integer) (ss & 0xFF)));
        }
        return sb.toString();
    }

    /**
     * 字节转为中文
     *
     * @param target
     * @return
     */
    public static String binaryToChinese(String target) {
        String[] binaryArr = new String[target.length() / 8];
        for (int i = 0; i < target.length(); i = i + 8) {
            binaryArr[i / 8] = target.substring(i, i + 8);
        }
        StringBuilder strBuilder = new StringBuilder();
        byte[] mm3 = new byte[binaryArr.length];
        for (int i = 0; i < binaryArr.length; i++) {
            String m = binaryArr[i];
            int nn4 = Integer.parseInt(m, 2);
            byte mm = (byte) (nn4);
            mm3[i] = mm;
        }
        return new String(mm3, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String toBinary = chineseToBinary("我爱你我的你的");
        binaryToChinese(toBinary);
    }
}
