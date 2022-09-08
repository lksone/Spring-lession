package com.demo.respose.image;

import com.aspose.imaging.Image;
import com.aspose.imaging.RasterImage;
import com.aspose.imaging.Rectangle;
import com.aspose.imaging.fileformats.svg.SvgImage;
import com.aspose.imaging.fileformats.svg.graphics.SvgGraphics2D;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 14:45
 */
public class SVGDemo {

    public static void main(String[] args) {
        RasterImage imageToDraw = (RasterImage) Image.load("D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\pexels-andrea-garibay-13221178.jpg");
        SvgImage resultImage = null;
        SvgImage canvasImage = null;
        try {
            canvasImage = (SvgImage) Image.load("D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\1691371.svg");
            SvgGraphics2D graphics = new SvgGraphics2D(canvasImage);
            // Draw a rectagular part of the raster image within the specified bounds of the vector image (drawing surface).
            // Note that because the source size is not equal to the destination one, the drawn image is stretched horizontally and vertically.
            graphics.drawImage(
                    new Rectangle(0, 0, imageToDraw.getWidth(), imageToDraw.getHeight()),
                    new Rectangle(67, 67, imageToDraw.getWidth(), imageToDraw.getHeight()),
                    imageToDraw);
            // Save the result image
            resultImage = graphics.endRecording();
            resultImage.save("D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\1691371.svg");
        } finally {
            resultImage.close();
            canvasImage.close();
            imageToDraw.close();
        }
    }
}
