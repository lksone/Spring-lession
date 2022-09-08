package com.demo.respose.utils.file;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 17:50
 */
public class FileUtil {

    private FileUtil() {
    }


    /**
     * 流关闭
     *
     * @param closeable 可关闭
     */
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
