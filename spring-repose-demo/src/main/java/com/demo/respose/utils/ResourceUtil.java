package com.demo.respose.utils;

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

    /**
     * 获取resource的文件数据类型，当前的方法主要是将打包的过程中，将resources文件打包到classes包下才能够生效
     * 因为当前运行的class是编译后的环境
     *
     * @param fileName
     */
    public static String function1(String fileName) {
        //注意getResource("")里面是空字符串
        return ResourceUtil.class.getClassLoader().getResource(fileName).getPath();
    }

    /**
     * springboot的获取文件的方式
     * @param fileName
     * @return
     */
   /* public static String getPath(String fileName) {
        ClassPathResource classPathResource = new ClassPathResource("config/db.properties");
    }*/

    public static void main(String[] args) {
        function1("a.docx");
    }
}
