package com.demo.respose.vsd;

import com.aspose.diagram.*;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/7 10:16
 */
public class VsdInsertShape {


    public static void main(String[] args) throws Exception {
        insertImage();
        String dataDir = "C:\\Users\\Administrator\\Desktop\\123.vsdx";
        Diagram diagram = new Diagram(dataDir);
        for (Object page : diagram.getPages()) {
            if(page instanceof Page){
                Page page1 = (Page) page;
                for (int i = 0; i < page1.getShapes().getCount(); i++) {
                    Shape shape = page1.getShapes().get(i);
                    System.out.println("shape name is "+shape.getName());
                }
            }
        }

    }


    /**
     * 插入图片信息
     * @throws Exception
     */
    private static void insertImage() throws Exception {
        String dataDir = "C:\\Users\\Administrator\\Desktop\\123.vsdx";
        Diagram diagram = new Diagram(dataDir);
        Page page = diagram.getPages().getPage(0);
        double pinX = 3, pinY = 3, width = 1, hieght = 1;
        File file = new File("D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\34.jpeg");
        FileInputStream fis = new FileInputStream(file);
        long l = page.addShape(pinX, pinY, width, hieght, fis);
        Image image1 = page.getShapes().getShape(l).getImage();
        image1.getTransparency().setValue(0.5);
        image1.setDel(1);
        Shape shape = page.getShapes().getShape(l);
        shape.sendToBack();
        page.getShapes().getShape(l).setName("这是一个信息");
        diagram.save(dataDir, SaveFileFormat.VSDX);
    }
}
