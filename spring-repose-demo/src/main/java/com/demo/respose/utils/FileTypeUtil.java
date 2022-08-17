package com.demo.respose.utils;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/12 10:02
 */

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件类型与对应的文件魔数处理工具类
 */
public class FileTypeUtil {


    /**
     * 通过文件路径获取文件类型
     *
     * @param path
     * @return FileTypeEnum - 文件类型与对应的文件魔数枚举类
     */
    public static FileTypeEnum getFileTypeByPath(String path) {
        // 获取文件头
        String magicNumberCode = magicNumberCode = getFileHeaderHexByPath(path);
        if (StringUtils.isNotBlank(magicNumberCode)) {
            return FileTypeEnum.getByMagicNumberCode(magicNumberCode.toUpperCase());
        }
        return FileTypeEnum.NOT_EXITS_ENUM;
    }

    /**
     * 通过文件流获取文件类型
     *
     * @param inputStream
     * @return FileTypeEnum - 文件类型与对应的文件魔数枚举类
     */
    public static FileTypeEnum getFileTypeByInputStream(InputStream inputStream) {
        // 获取文件头
        String magicNumberCode = getFileHeaderHexByInputStream(inputStream);
        if (StringUtils.isNotBlank(magicNumberCode)) {
            return FileTypeEnum.getByMagicNumberCode(magicNumberCode.toUpperCase());
        }
        return FileTypeEnum.NOT_EXITS_ENUM;
    }


    /**
     * 获取文件头（即文件魔数），根据文件路径
     *
     * @param path
     * @return fileHeaderHex - 文件头，即文件魔数
     */
    public static String getFileHeaderHexByPath(String path) {
        byte[] b = new byte[28];
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            inputStream.read(b, 0, 28);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bytesToHexString(b);
    }

    /**
     * 获取文件头（即文件魔数），根据通过文件流
     *
     * @param inputStream
     * @return fileHeaderHex - 文件头，即文件魔数
     */
    public static String getFileHeaderHexByInputStream(InputStream inputStream) {
        byte[] b = new byte[28];
        try {
            inputStream.read(b, 0, 28);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bytesToHexString(b);
    }

    /**
     * 将文件二进制流（即字节数组）转换成16进制字符串数据
     *
     * @param b
     * @return fileHeaderHex - 文件头，即文件魔数
     */
    private final static String bytesToHexString(byte[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        if (b == null || b.length <= 0) {
            return null;
        }

        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws Exception {
       /* File fromPic = new File("book1.xls");

        FileTypeEnum fileTypeEnum = FileTypeUtil.getFileTypeByInputStream(new FileInputStream(fromPic));
        System.out.println(fileTypeEnum.getFileTypeName());
        System.out.println(fileTypeEnum.getMagicNumberCode());
        System.out.println(fileTypeEnum);*/

        FileTypeEnum fileTypeEnum2 = FileTypeUtil.getFileTypeByPath("excel.xlsx");
        System.out.println(fileTypeEnum2.getFileTypeName());
        System.out.println(fileTypeEnum2.getMagicNumberCode());
        System.out.println(fileTypeEnum2);

       // System.out.println(getFileHeaderHexByInputStream(new FileInputStream("bb.docx")));
    }
}
