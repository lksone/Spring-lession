package com.demo.respose.slides;

import com.aspose.slides.*;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/11 18:00
 */
public class SlidesDemo {


    public static void main(String[] args) {
        Presentation pres = new Presentation("D:\\workspace5\\Spring-lession\\spring-repose-demo\\123.pptx");
        try {
            // Accesses the first slide
            ISlide sld = pres.getSlides().get_Item(0);
            // Iterates through shapes to find the placeholder
            for (IShape shp : sld.getShapes()) {
                if (shp.getPlaceholder() != null) {
                    // Changes the text in each placeholder
                    ((IAutoShape) shp).getTextFrame().setText("This is Placeholder");
                }
            }
            // Saves the presentation to disk
            pres.save("D:\\workspace5\\Spring-lession\\spring-repose-demo\\123.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) {
                pres.dispose();
            }
        }
    }
}
