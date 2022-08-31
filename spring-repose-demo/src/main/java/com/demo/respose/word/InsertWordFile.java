package com.demo.respose.word;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.Shape;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/26 10:32
 */
public class InsertWordFile {


    public static void main(String[] args) throws Exception {
        Document doc = new Document();
        String dataDir = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\";
        DocumentBuilder builder = new DocumentBuilder(doc);
        Shape shape = builder.insertOleObjectAsIcon(dataDir + "excel.xlsx", false, dataDir + "icon.ico", "My embedded file");
        doc.save(dataDir + "EmbeddeWithIcon_out.docx");
    }

    private static void extracted1() throws Exception {
        Document doc = new Document();
        String dataDir = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\";
        DocumentBuilder builder = new DocumentBuilder(doc);
        Shape shape = builder.insertOleObjectAsIcon(dataDir + "excel.xlsx", false, dataDir + "icon.ico", "My embedded file");
        doc.save(dataDir + "EmbeddeWithIcon_out.docx");
    }

    private static void extracted() throws Exception {
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        String myDir = "C:\\Users\\SN2OV\\Desktop\\wordDemo\\src\\main\\resources\\File\\";
        BufferedImage image = ImageIO.read(new File(myDir + "word32.png"));
        String fileArr[] = new String[]{"InsertDocument1.doc","InsertDocument2.doc","其他合同模板.docx","商务标.rar", "成本模拟部署测试问题-其他所有模块.xls","其他合同模板.doc","乾鸣国际信息产业园（一期）1号楼、8号楼机电安装工程施工-中标通知书.pdf"};
        for(String file :fileArr){
            if(file.endsWith("png")){
                Shape shape = builder.insertImage(myDir + file);
                builder.writeln();
                builder.writeln(file);
                continue;
            }
            Shape oleObject = builder.insertOleObject(myDir + file, false, true, new BufferedInputStream(new FileInputStream(new File(""))));
            builder.writeln(file);
            builder.writeln();
        }
        doc.save(myDir + "out.docx");
    }
}
