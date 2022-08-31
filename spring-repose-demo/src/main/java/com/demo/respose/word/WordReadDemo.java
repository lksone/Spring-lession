package com.demo.respose.word;

import com.aspose.words.*;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/26 09:56
 */
public class WordReadDemo {


    public static void main(String[] args) throws Exception {
        Document wordDocument = new Document( "D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\likesheng .docx" );
        NodeCollection<Shape> shapes = wordDocument.getChildNodes(NodeType.SHAPE, true);
        for (Shape shape : shapes) {
            OleFormat oleFormat = shape.getOleFormat();
            System.out.println(oleFormat.getSuggestedExtension());
            System.out.println(oleFormat.getSuggestedFileName());
            String type = shape.getOleFormat().getProgId().toLowerCase();
            System.out.println(oleFormat.getSuggestedFileName());
            System.out.println(shape.getOleFormat().getIconCaption());
            System.out.println(type);
        }
    }

}
