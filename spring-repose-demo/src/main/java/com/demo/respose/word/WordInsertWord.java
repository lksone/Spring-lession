package com.demo.respose.word;

import com.aspose.words.Document;

/**
 * 文件内嵌文档
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/25 21:51
 */
public class WordInsertWord {


    public static void readText() throws Exception {
     //   Document document = new Document("D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\likesheng .docx");
        Document document = new Document("D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\a.docx");
        String text = document.getText();
        System.out.println(text);
        System.out.println("结束");
    }


    public static void main(String[] args) throws Exception {
        readText();
    }
}
