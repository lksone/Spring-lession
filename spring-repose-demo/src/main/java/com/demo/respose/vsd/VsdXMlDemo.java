package com.demo.respose.vsd;

import com.demo.respose.utils.*;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/5 14:45
 */
public class VsdXMlDemo {


    public static void main(String[] args){
        String filePath = "C:\\network.vsd";
        String outputDir = filePath + ".output";
        // 创建Visio对象
        IVApplication app = ClassFactory.createApplication();
        // Visio对象设置为可见
        app.visible(true);
        // 打开一个Visio文件
        IVDocument doc = app.documents().open(filePath);
        // 创建一个Dom4j类型的Document对象
        Document xmlDoc = DocumentHelper.createDocument();
        Element root = xmlDoc.addElement("page");
        try {
            // 只读取Visio文档中第一个页面的信息
            IVPage page = doc.pages().itemFromID(0);
            // 读取Page对象的长和宽，并转化为像素单位（乘以96）
            root.addAttribute("width", "" + ((int) (page.pageSheet().cells("PageWidth").resultIU() * 96)));
            root.addAttribute("height", "" + ((int) (page.pageSheet().cells("PageHeight").resultIU() * 96)));
            IVShapes shapes = page.shapes();
            System.out.println("shapes="+shapes.count());
            // 遍历该Page对象中所有的Shape对象
            for (int shapeCount = 1; shapeCount <= shapes.count(); shapeCount++) {
                IVShape shape = shapes.itemU(shapeCount);

                String shapeId = shape.text();
                System.out.println("shapeName="+shape.name());
                System.out.println("PinX="+shape.cells("PinX").resultIU()*25.4);
                // System.out.println("自定义属性="+shape.cellsU("Prop.equ").result(new String()));

                // 找出被我们事先标识了的Shape对象进行进一步处理
                if (shapeId.length() > 0) {
                    // 在page元素下面新建一个shape元素
                    Element shapeElement = root.addElement("shape");
                    // 为shape元素添加id,height,width,x,y等属性
                    shapeElement.addAttribute("id", shapeId);
                    shapeElement.addAttribute("height", "" + ((int) (shape.cells("Height").resultIU() * 96)));
                    shapeElement.addAttribute("width", "" + ((int) (shape.cells("Width").resultIU() * 96)));
                    shapeElement.addAttribute("x", "" + ((int) (shape.cells("PinX").resultIU() * 96)));
                    shapeElement.addAttribute("y", "" + ((int) (shape.cells("PinY").resultIU() * 96)));
                    shape.text("");
                    shape.export(outputDir + "\\" + shapeId + ".gif");
                }
            }
            doc.saved(true);
        }finally {
            doc.close();// 关闭打开的文件
            app.quit();// 退出Visio应用程序
        }
        try {
            // lets write to a file
            XMLWriter writer = new XMLWriter(new FileWriter("output.xml"));
            writer.write(xmlDoc);
            writer.close();
        }catch (IOException e) {

        }
    }
}
