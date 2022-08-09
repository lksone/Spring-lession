package com.demo.respose;

import com.aspose.words.Font;
import com.aspose.words.Shape;
import com.aspose.words.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

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
     * 读取文档内容，文档的加密功能
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

    /**
     * 文档加密只能读
     *
     * @throws Exception
     */
    public static void passwordToWord() throws Exception {
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.write("这是一个测试效果的解密");
        // 将密码应用于 Word 文档
        doc.protect(ProtectionType.READ_ONLY, "12345");
        doc.save("password.docx", SaveFormat.DOCX);
        System.out.println("Done");
    }

    /**
     * 添加评论，这里有问题，如何区分段落问题 Paragraphs
     *
     * @throws Exception
     */
    public static void addWordComment() throws Exception {
        Document DocumentForComment = new Document("OutputDocumentWithComments.docx");
        DocumentBuilder builder = new DocumentBuilder(DocumentForComment);

        // Move the cursor to the beginning of the document for adding comments
        builder.moveToDocumentStart();

        // 通过提供作者、姓名首字母、时间和评论文本在文档的第一段插入评论
        Comment comment = new Comment(DocumentForComment, "李科胜", "AW", new Date());
        //当前段落添加评论
        builder.getCurrentParagraph().appendChild(comment);
        //获取段落，什么是段落？
        comment.getParagraphs().add(new Paragraph(DocumentForComment));
        comment.getFirstParagraph().getRuns().add(new Run(DocumentForComment, "评论内容，如何添加的呢"));
        // Save the Document with comments
        DocumentForComment.save("OutputDocumentWithComments.docx");
    }


    /**
     * 添加图片的信息，插入图片信息
     *
     * @throws Exception
     */
    public static void addImageDocument() throws Exception {
        //添加文档
        Document AddImagesToWordDOC = new Document("bb.docx");
        DocumentBuilder imageWriter = new DocumentBuilder(AddImagesToWordDOC);
        imageWriter.moveToHeaderFooter(HeaderFooterType.HEADER_PRIMARY);
        //添加图片
        Shape headerImage = imageWriter.insertImage("123.jpeg");
        // equals to one inch
        headerImage.setWidth(1 * 72);
        headerImage.setHeight(1 * 72);
        //移动到最后的段落的后面,移动的位置
        imageWriter.moveTo(AddImagesToWordDOC.getLastSection().getBody().getFirstParagraph());
        //其他的方法
        Shape imageAsLinkToFile = imageWriter.insertImage("123.jpeg");
        imageAsLinkToFile.getImageData().setSourceFullName("123.jpeg");
        AddImagesToWordDOC.save("Images.docx");
    }

    /**
     * 文件位置居中
     * @throws Exception
     */
    public static void addImageDocument2() throws Exception {
        Document document = new Document();
        DocumentBuilder builder = new DocumentBuilder(document);
        //需要添加的形状
        Shape shape = builder.insertImage("123.jpeg");
        //设置包裹类型
        shape.setWrapType(WrapType.NONE);
        //设置文本后面
        shape.setBehindText(true);
        //相对水平的位置
        shape.setRelativeHorizontalPosition(RelativeHorizontalPosition.COLUMN);
        //相对垂直位置
        shape.setRelativeVerticalPosition(RelativeVerticalPosition.MARGIN);
        //设置水平位置
        shape.setHorizontalAlignment(HorizontalAlignment.CENTER);
        //设置垂直位置
        shape.setVerticalAlignment(VerticalAlignment.CENTER);
        shape.setWidth(90);
        shape.setHeight(90);
        document.save("CreateFloatingPageCenter.docx");
    }

    public static void main(String[] args) throws Exception {
        addImageDocument2();
        System.out.println("执行完成");
    }

}
