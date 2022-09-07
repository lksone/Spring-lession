package com.demo.respose.ofd;

import org.ofdrw.core.annotation.pageannot.AnnotType;
import org.ofdrw.layout.OFDDoc;
import org.ofdrw.layout.StreamCollect;
import org.ofdrw.layout.edit.Annotation;
import org.ofdrw.layout.element.PageAreaFiller;
import org.ofdrw.layout.element.Paragraph;
import org.ofdrw.reader.OFDReader;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/2 11:32
 */
public class OFDDemo {


    public static void main(String[] args) throws IOException {
        addImage();
    }

    private static void addImage() throws IOException {
        Path srcP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        Path outP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        Path imgPath = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\34.jpeg");

        try (OFDReader reader = new OFDReader(srcP);
             OFDDoc ofdDoc = new OFDDoc(reader, outP)) {
            for (int i = 1; i <= reader.getPageList().size(); i++) {
                Annotation annotation = new Annotation(70d, 100d, 60d, 60d, AnnotType.Watermark, ctx -> {
                    ctx.setGlobalAlpha(1d);
                    ctx.drawImage(imgPath, 0, 0, 40d, 40d);
                });
                annotation.setRemark("测试数据");
                ofdDoc.addAnnotation(i, annotation);
            }
        }
        System.out.println("生成文档位置：" + outP.toAbsolutePath().toString());
    }

    private static void addWrite() throws IOException {
        Path path = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd").toAbsolutePath();
        try (OFDDoc ofdDoc = new OFDDoc(path)) {
            Paragraph p = new Paragraph("你好呀，OFD Reader&Writer！", 8d);
            ofdDoc.add(p);
            String boxSize = ofdDoc.getOfdDocument().getCommonData().getPageArea().getApplicationBox().toString();
            p = new Paragraph(String.format("页面尺寸为 [%s]", boxSize), 5d);
            ofdDoc.add(p);
        }
        System.out.println("生成文档位置: " + path.toAbsolutePath());
    }

    /**
     * 插入新的页面信息
     * @throws IOException
     */
    private static void addInputStream() throws IOException {
        Path srcP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        Path outP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        try (OFDReader reader = new OFDReader(srcP);
             OFDDoc ofdDoc = new OFDDoc(reader, outP)) {
            // 插入到第1页 位置，后面的所有内容从第1页开始递增
            StreamCollect sPage1 = new StreamCollect(1);
            sPage1.setPageNum(1);
            Paragraph p = new Paragraph("封面", 30d).setWidth(100d);
            sPage1.add(p);
            // 换页： 插入占位符告诉解析器
            sPage1.add(new PageAreaFiller());
            // 这里开始 第2页 内容
            Paragraph p2 = new Paragraph("前言", 15d).setWidth(40d);
            sPage1.add(p2);
            ofdDoc.addStreamCollect(sPage1);

            // 插入到最后一页
            Paragraph p3 = new Paragraph("尾页", 15d).setWidth(100d);
            ofdDoc.add(p3);
        }
        System.out.println("生成文档位置：" + outP.toAbsolutePath().toString());
    }
}
