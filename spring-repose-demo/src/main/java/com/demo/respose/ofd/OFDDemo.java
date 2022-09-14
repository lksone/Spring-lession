package com.demo.respose.ofd;

import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.ofdrw.core.annotation.pageannot.AnnotType;
import org.ofdrw.core.basicStructure.pageObj.Page;
import org.ofdrw.core.basicType.ST_Box;
import org.ofdrw.font.FontName;
import org.ofdrw.layout.OFDDoc;
import org.ofdrw.layout.StreamCollect;
import org.ofdrw.layout.VirtualPage;
import org.ofdrw.layout.edit.Annotation;
import org.ofdrw.layout.element.Img;
import org.ofdrw.layout.element.PageAreaFiller;
import org.ofdrw.layout.element.Paragraph;
import org.ofdrw.layout.element.canvas.FontSetting;
import org.ofdrw.layout.exception.DocReadException;
import org.ofdrw.reader.OFDReader;

import java.io.File;
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
        File f = new File(OFDDemo.class.getResource("/").getPath());
        System.out.println(f.getAbsolutePath());
    }

    /**
     * 添加水印信息，可以写入文字的方式
     */
    public static void addWaterMarkToWord() {
        Path srcP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        Path outP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        try (OFDReader reader = new OFDReader(srcP); OFDDoc ofdDoc = new OFDDoc(reader, outP)) {
            Double width = ofdDoc.getPageLayout().getWidth();
            Double height = ofdDoc.getPageLayout().getHeight();
            Annotation annotation = new Annotation(new ST_Box(0d, 0d, width, height), AnnotType.Watermark, ctx -> {
                FontSetting setting = new FontSetting(8, FontName.SimSun.font());
                ctx.setFillColor(170, 160, 165)
                        .setFont(setting)
                        .setGlobalAlpha(0.4);
                //多少行多少列
                for (int i = 0; i <= 8; i++) {
                    for (int j = 0; j <= 8; j++) {
                        ctx.save();
                        //旋转
                        ctx.translate(22.4 * i, j * 50);
                        ctx.rotate(45);
                        ctx.fillText("保密资料", 10, 10);
                        ctx.restore();
                    }
                }
            });
            ofdDoc.addAnnotation(1, annotation);
        } catch (DocReadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("生成文档位置：" + outP.toAbsolutePath().toString());
    }


    /**
     * 添加水印图片的方式
     *
     * @throws IOException
     */
    private static void addWaterMarkToImage() throws IOException {
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

    private static void addImage2() throws IOException {
        Path srcP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\b.ofd");
        Path outP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\b.ofd");
        Path imgPath = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\34.jpeg");
        try (OFDReader reader = new OFDReader(srcP);
             OFDDoc ofdDoc = new OFDDoc(reader, outP)) {
            for (int i = 1; i <= reader.getPageList().size(); i++) {
                VirtualPage avPage = ofdDoc.getAVPage(i);
                Img img = new Img(50, 12, imgPath);
                img.setPadding(0.5d);
                img.setBorder(0.5d);
                img.setOpacity(0.5d);
                avPage.add(img);
                ofdDoc.addVPage(avPage);
            }
        }
        System.out.println("生成文档位置：" + outP.toAbsolutePath().toString());
    }


    private static void readImage() throws IOException {
        Path srcP = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\a.ofd");
        try (OFDReader reader = new OFDReader(srcP)) {
            Path workDir = reader.getWorkDir();
            System.out.println(workDir.toAbsolutePath().toString());
            Page page = reader.getPage(1);
            Document document = page.getDocument();
            DocumentType docType = document.getDocType();

        }
    }

    /**
     * 创建一个ofd文件
     *
     * @throws IOException
     */
    private static void addWrite() throws IOException {
        Path path = Paths.get("D:\\workspace5\\Spring-lession\\spring-repose-demo\\b.ofd").toAbsolutePath();
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
