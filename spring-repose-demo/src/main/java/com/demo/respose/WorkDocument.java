package com.demo.respose;

import com.aspose.words.Font;
import com.aspose.words.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Document文档数据更新
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/8 18:14
 */
public class WorkDocument {

    /**
     * 创建表格数据信息
     *
     * @throws Exception
     */
    public static void createTableToWord() throws Exception {
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.startTable();
        //插入cell
        builder.insertCell();
        builder.write("Row 1, Cell 1.");
        builder.insertCell();
        builder.write("Row 1, Cell 2.");
        builder.endRow();
        //创建表格的数据信息
        builder.insertCell();
        builder.write("Row 2, Cell 1.");
        builder.insertCell();
        builder.write("Row 2, Cell 2.");
        builder.endTable();
        doc.save("DocumentBuilder.CreateTable.docx");
    }

    /**
     * 创建页头和页尾
     */
    public static void createFooterAndHeader() throws Exception {
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.getPageSetup().setDifferentFirstPageHeaderFooter(true);
        builder.getPageSetup().setOddAndEvenPagesHeaderFooter(true);
        builder.moveToHeaderFooter(HeaderFooterType.HEADER_FIRST);
        builder.write("Header for the first page");
        builder.moveToHeaderFooter(HeaderFooterType.HEADER_EVEN);
        builder.write("Footer for the first page");
        builder.moveToHeaderFooter(HeaderFooterType.FOOTER_EVEN);
        builder.write("Header for even pages");
        builder.moveToHeaderFooter(HeaderFooterType.HEADER_PRIMARY);
        builder.write("Header for all other pages");

        builder.moveToSection(0);
        builder.writeln("Page1");
        //插入分页符
        builder.insertBreak(BreakType.PAGE_BREAK);
        builder.writeln("Page2");
        //插入分页符
        builder.insertBreak(BreakType.PAGE_BREAK);
        builder.writeln("Page3");

        doc.save("DocumentBuilder.HeadersAndFooters.docx", SaveFormat.DOCX);
    }

    /**
     * 文档写入到内部
     *
     * @throws Exception
     */
    public static void documentWriteText() throws Exception {
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        //设置字体
        Font font = builder.getFont();
        font.setSize(16.0);
        font.setBold(true);
        font.setColor(Color.BLUE);
        font.setName("Courier New");
        font.setUnderline(Underline.DASH);
        //写入文档对象
        builder.write("Hello world!");
        doc.save("bb.docx");
    }

    /**
     * 读取文档内容
     *
     * @throws Exception
     */
    public static void documentReadDoc() throws Exception {
        String filename = "bb.docx";
        InputStream in = new FileInputStream(filename);
        Document doc = new Document(in);
        System.out.println("Document opened. Total pages are " + doc.getPageCount());
        System.out.println("文档内容" + doc.getText());
        in.close();
    }

    public static void main(String[] args) throws Exception {
        documentReadDoc();
    }

}
