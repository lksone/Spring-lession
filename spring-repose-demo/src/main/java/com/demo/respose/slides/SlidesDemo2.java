package com.demo.respose.slides;

import com.aspose.slides.AutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextHighlightingOptions;

public class SlidesDemo2 {


    public static void main(String[] args) {
        Presentation presentation = new Presentation("D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\123.pptx");
        ((AutoShape)presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("This", java.awt.Color.red);
        TextHighlightingOptions options = new TextHighlightingOptions();
        options.setWholeWordsOnly(true);
        ((AutoShape)presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("the", java.awt.Color.DARK_GRAY, options);
        presentation.save("D:\\workspace5\\Spring-lession\\spring-repose-demo\\src\\main\\resources\\124.pptx", SaveFormat.Pptx);

    }
}
