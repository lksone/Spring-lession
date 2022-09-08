package com.demo.respose.image;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 13:22
 */
public class ImageLister implements ImageObserver {

    public ImageLister() {
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
