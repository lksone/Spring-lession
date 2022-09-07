package com.demo.respose.pdf;

import com.aspose.pdf.*;
import com.aspose.pdf.operators.ConcatenateMatrix;
import com.aspose.pdf.operators.Do;
import com.aspose.pdf.operators.GRestore;
import com.aspose.pdf.operators.GSave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/31 15:50
 */
public class PDFDemo {


    public static void main(String[] args) throws FileNotFoundException {
        Document pdfDocument = new Document("D:\\workspace5\\Spring-lession\\spring-repose-demo\\aaa.pdf");
        int lowerLeftX = 100;
        int lowerLeftY = 100;
        int upperRightX = 200;
        int upperRightY = 200;
        File file = new File("D:\\workspace5\\Spring-lession\\spring-repose-demo\\icon.ico");
        Page page = pdfDocument.getPages().get_Item(9);
            file.setWritable(Boolean.TRUE,Boolean.TRUE);
            FileInputStream imageStream = new FileInputStream(file.getAbsolutePath());
            page.getResources().getImages().add(imageStream);
            page.getContents().add(new GSave());
            Rectangle rectangle = new Rectangle(lowerLeftX, lowerLeftY, upperRightX, upperRightY);
            Matrix matrix = new Matrix(new double[] { rectangle.getURX() - rectangle.getLLX(), 0, 0, rectangle.getURY() - rectangle.getLLY(), rectangle.getLLX(), rectangle.getLLY() });
            page.getContents().add(new ConcatenateMatrix(matrix));
            XImage ximage = page.getResources().getImages().get_Item(page.getResources().getImages().size());
            page.getContents().add(new Do(ximage.getName()));
            page.getContents().add(new GRestore());
        pdfDocument.save("D:\\workspace5\\Spring-lession\\spring-repose-demo\\aaa.pdf");
    }
}
