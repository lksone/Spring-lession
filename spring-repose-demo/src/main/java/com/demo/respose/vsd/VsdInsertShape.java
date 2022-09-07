package com.demo.respose.vsd;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;

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
        String dataDir = "C:\\Users\\Administrator\\Desktop\\output.vsdx";
        Diagram diagram = new Diagram(dataDir);
        Page page = diagram.getPages().getPage(0);
        double pinX = 3, pinY = 3, width = 4, hieght = 4;
        File file = new File("D:\\workspace5\\Spring-lession\\spring-repose-demo\\34.jpeg");
        FileInputStream fis = new FileInputStream(file);
        long l = page.addShape(pinX, pinY, width, hieght, fis);
        page.getShapes().getShape(l).getImage().getTransparency().setValue(0.5);
        diagram.save(dataDir, SaveFileFormat.VSDX);
    }
}
