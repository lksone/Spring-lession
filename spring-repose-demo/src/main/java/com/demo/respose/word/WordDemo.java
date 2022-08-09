package com.demo.respose.word;

import com.aspose.words.Shape;
import com.aspose.words.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/8 15:19
 */
public class WordDemo {

    /**
     * 获取权限的licence的权限
     */
    private static InputStream licence;

    /**
     * 字節流
     */
    private static InputStream inputStream;

    /**
     * 插入水印
     *
     * @param document              document對象
     * @param watermarkText         水印字体
     */
    public static void insertWatermarkText(Document document, String watermarkText) throws Exception {
        //创建一个shape 形状，水印
        Shape watermark = new Shape(document, ShapeType.TEXT_PLAIN_TEXT);
        //设置水印
        watermark.getTextPath().setText(watermarkText);
        //设置字体
        watermark.getTextPath().setFontFamily("Arial");
        watermark.setWidth(500);
        watermark.setHeight(500);
        //旋转
        watermark.setRotation(-40);

        //背景颜色
        watermark.getFill().setBackColor(Color.GRAY);
        //设置描边的颜色
        watermark.setStrokeColor(Color.BLUE);
        //相对水平位置
        watermark.setRelativeHorizontalPosition(RelativeHorizontalPosition.PAGE);
        watermark.setRelativeVerticalPosition(RelativeHorizontalPosition.PAGE);

        watermark.setWrapType(WrapType.NONE);
        watermark.setVerticalAlignment(VerticalAlignment.CENTER);
        watermark.setHorizontalAlignment(HorizontalAlignment.CENTER);

        //段落
        Paragraph watermarkPara = new Paragraph(document);
        watermarkPara.appendChild(watermark);
        //插入水印
        for (Section section : document.getSections()) {
            //三种不同的类型
           // insertWatermarkHeader(watermarkPara, section, HeaderFooterType.HEADER_PRIMARY);
            //insertWatermarkHeader(watermarkPara, section, HeaderFooterType.HEADER_FIRST);
            insertWatermarkHeader(watermarkPara, section, HeaderFooterType.HEADER_EVEN);
        }

    }


    /**
     * 插入水印，页眉和页脚
     *
     * @param watermarkPara
     * @param section
     * @param headerType
     */
    public static void insertWatermarkHeader(Paragraph watermarkPara, Section section, int headerType) {
        HeaderFooter headerFooter = section.getHeadersFooters().getByHeaderFooterType(headerType);
        if (headerFooter != null) {
            headerFooter = new HeaderFooter(section.getDocument(), headerType);
            section.getHeadersFooters().add(headerFooter);
        }
        //插入clone的水印
        headerFooter.appendChild(watermarkPara.deepClone(true));
    }

    /**
     * 移除水印
     *
     * @param document
     */
    public static void removeWatermark(Document document) {
        for (Section section : document.getSections()) {
            removeWatermarkFromHeader(section, HeaderFooterType.HEADER_EVEN);
            removeWatermarkFromHeader(section, HeaderFooterType.HEADER_PRIMARY);
            removeWatermarkFromHeader(section, HeaderFooterType.HEADER_FIRST);
        }
    }

    /**
     * 插入图片
     *
     * @param document
     * @throws Exception
     */
    public static void insertInmage(Document document, String imagePath) throws Exception {
        DocumentBuilder builder = new DocumentBuilder(document);
        BufferedImage read = ImageIO.read(new FileInputStream(imagePath));
        //输出文件的二进制
        //移动到标签的地方
        //  builder.moveToBookmark("userimage");
        //移动到文档尾部
        // builder.moveToDocumentEnd();
        //页头的位置，header插入图片
        //  builder.moveToHeaderFooter(HeaderFooterType.HEADER_PRIMARY);
        //页的尾部地方
        builder.moveToHeaderFooter(HeaderFooterType.FOOTER_PRIMARY);
        //插入图片
        builder.insertImage(read, 90, 90);
    }

    /**
     * 移除指定的section的水印
     *
     * @param section    部分？？待定
     * @param headerType 类型
     */
    public static void removeWatermarkFromHeader(Section section, int headerType) {
        HeaderFooter headerFooter = section.getHeadersFooters().getByHeaderFooterType(headerType);
        if (headerFooter != null) {
            //存在就删除
            headerFooter.removeAllChildren();
        }
    }

    /**
     * 写入文档内容
     *
     * @param text
     * @throws Exception
     */
    public static void workWrite(String text) throws Exception {
        Document docA = new Document();
        DocumentBuilder builder = new DocumentBuilder(docA);
        builder.moveToDocumentStart();
        builder.write(text);
        Document docB = new Document("cc.docx");
        docA.appendDocument(docB, ImportFormatMode.KEEP_SOURCE_FORMATTING);
        docA.save("dd.pdf");
    }

    public static void main(String[] args) throws Exception {
        //1、插入数据图片
       /* Document document = new Document("D:\\workspace5\\Spring-lession\\bb.docx");
        insertInmage(document, "D:\\workspace5\\Spring-lession\\123.jpeg");
        //保存数据
        document.save("D:\\workspace5\\Spring-lession\\bb.docx", SaveFormat.JPEG);
        System.out.println("运行完成");*/


        Document waterMark = new Document("bb.docx");
        insertWatermarkText(waterMark,"李科胜");
        waterMark.save("bb.docx",SaveFormat.DOCX);
    }
}
