package com.demo.respose;

import com.aspose.words.*;

import java.util.function.Function;

/**
 * 水印
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/9 13:25
 */
public class WordWaterMark {


    /**
     * 插入
     *
     * @param doc           document对象
     * @param watermarkText watermark
     */
    public static void insertWaterMark(Document doc, String watermarkText) {
        //居中,mark的居中效果
        insertWatermarkText(doc, watermarkText, watermark -> {
            // Place the watermark in the page center.
            watermark.setRelativeHorizontalPosition(RelativeHorizontalPosition.PAGE);
            watermark.setRelativeVerticalPosition(RelativeVerticalPosition.PAGE);
            watermark.setWrapType(WrapType.NONE);
            watermark.setVerticalAlignment(VerticalAlignment.CENTER);
            watermark.setHorizontalAlignment(HorizontalAlignment.CENTER);
            return null;
        });

        // 顶部，mark
        insertWatermarkText(doc, watermarkText, watermark -> {
            watermark.setRelativeHorizontalPosition(RelativeHorizontalPosition.MARGIN);
            watermark.setRelativeVerticalPosition(RelativeVerticalPosition.MARGIN);
            watermark.setWrapType(WrapType.NONE);
            // 垂直线
            watermark.setVerticalAlignment(VerticalAlignment.TOP);
            //水平线
            watermark.setHorizontalAlignment(HorizontalAlignment.CENTER);
            //  watermark.setTop(120);
            return null;
        });

        /*尾部*/
        insertWatermarkText(doc, watermarkText, watermark -> {
            watermark.setRelativeHorizontalPosition(RelativeHorizontalPosition.MARGIN);
            watermark.setRelativeVerticalPosition(RelativeVerticalPosition.MARGIN);
            watermark.setWrapType(WrapType.NONE);
            // 我们需要自定义距离顶部的高度
            watermark.setVerticalAlignment(VerticalAlignment.BOTTOM);
            watermark.setHorizontalAlignment(HorizontalAlignment.CENTER);
            // 设置距离顶部的高度
            //   watermark.setTop(480);
            return null;
        });
    }

    /**
     * 插入水印
     *
     * @param doc                         document对象
     * @param watermarkText               水印文本
     * @param watermaskPositionConfigFunc 水印位置funcation的占位方法
     */
    private static void insertWatermarkText(Document doc, String watermarkText, Function<Shape, Object> watermaskPositionConfigFunc) {
        Shape watermark = new Shape(doc, ShapeType.TEXT_PLAIN_TEXT);
        watermark.getTextPath().setText(watermarkText);
        // 这里设置为宋体可以保证在转换为PDF时中文不是乱码. 注意
        watermark.getTextPath().setFontFamily("WeiRuanYaHei");
        //WeiRuanYaHei 宋体
        try {
            // 水印大小
            watermark.setWidth(150);
            watermark.setHeight(30);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 左下到右上
        watermark.setRotation(-20);
        //字体RGB颜色
        final String colorStr = "EE8262";
        //设置颜色
        watermark.getFill().setColor(new java.awt.Color(Integer.parseInt(colorStr, 16)));
        watermark.setStrokeColor(new java.awt.Color(Integer.parseInt(colorStr, 16)));
        watermaskPositionConfigFunc.apply(watermark);
        Paragraph watermarkPara = new Paragraph(doc);
        watermarkPara.appendChild(watermark);
        //doc的部分
        for (Section sect : doc.getSections()) {
            insertWatermarkIntoHeader(watermarkPara, sect, HeaderFooterType.HEADER_PRIMARY);
        }
    }

    /**
     * 插入header
     *
     * @param watermarkPara 段落
     * @param sect          部分
     * @param headerType    headerType類型，footer 和 header
     */
    private static void insertWatermarkIntoHeader(Paragraph watermarkPara, Section sect, int headerType) {
        //获取到header和尾部的方法
        try {
            HeaderFooter header = sect.getHeadersFooters().getByHeaderFooterType(headerType);
            if (header == null) {
                header = new HeaderFooter(sect.getDocument(), headerType);
                sect.getHeadersFooters().add(header);
            }
            header.appendChild(watermarkPara.deepClone(true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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


    public static void main(String[] args) throws Exception {
        Document waterMark = new Document("bb.docx");
        insertWaterMark(waterMark, "李科胜");
        waterMark.save("bb.docx", SaveFormat.DOCX);
    }
}
