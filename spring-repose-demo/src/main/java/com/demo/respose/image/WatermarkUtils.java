package com.demo.respose.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 打印数据信息
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 15:29
 */
public class WatermarkUtils {

    private static List<File> fileList = new ArrayList<>();

    public static void main(String[] args) {
        fileList.add(new File("D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\pexels-andrea-garibay-13221178.jpg"));
        convertAllImages(fileList);
    }

    /**
     * 去除文件列表里图片的水印并替换
     *
     * @Param fileList 文件列表
     */
    public static void convertAllImages(List<File> fileList) {
        try {
            for (File file : fileList) {
                if (!file.getName().endsWith("png") && !file.getName().endsWith("jpg")) {
                    continue;
                }
                //用ImageIO流读取像素块
                BufferedImage bi = ImageIO.read(file);
                if (bi != null) {
                    removeWatermark(bi);
                    //生成的图片格式
                    String formatName = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                    //用ImageIO流生成的处理图替换原图片
                    ImageIO.write(bi, formatName, file);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 去除水印
     */
    private static void removeWatermark(BufferedImage bi) {
        Color wColor = new Color(254, 254, 254);
        Color hColor = new Color(197, 196, 191);
        //白底水印
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                int color = bi.getRGB(i, j);
                Color oriColor = new Color(color);
                int red = oriColor.getRed();
                int greed = oriColor.getGreen();
                int blue = oriColor.getBlue();
                if (red == 254 && greed == 254 && blue == 254) {
                    continue;
                }
                if (red > 220 && greed > 180 && blue > 80) {
                    bi.setRGB(i, j, wColor.getRGB());
                }
                if (red <= 240 && greed >= 200 && blue >= 150) {
                    bi.setRGB(i, j, wColor.getRGB());
                }
            }
        }
    }
}
