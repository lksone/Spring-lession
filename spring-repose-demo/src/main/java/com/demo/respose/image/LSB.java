package com.demo.respose.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LSB {

    public static void main(String[] args) throws IOException {
        String textPath = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\a.txt";
        String imagePath = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\pexels-andrea-garibay-13221178.jpg";
        String imageOutputPath = "";
        LSBEncoder(textPath, imagePath, imagePath);
    }

    /**
     * 文件读取数据信息
     *
     * @param textPath
     * @param imagePath
     * @param imageOutputPath
     * @throws IOException
     */
    public static void LSBEncoder(String textPath, String imagePath, String imageOutputPath) throws IOException {
        //读取png图像
        BufferedImage image = ImageIO.read(new File(imagePath));
        int width = image.getWidth();
        int height = image.getHeight();
        int[][][] rgb = new int[width][height][3];
        //将图像每个点的像素(R,G,B)存储在数组中
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                //读取的是一个24位的数据
                int pixel = image.getRGB(w, h);
                //数据三个字节分别代表R、B、G
                rgb[w][h][0] = (pixel & 0xff0000) >> 16;//R
                rgb[w][h][1] = (pixel & 0xff00) >> 8;//B
                rgb[w][h][2] = (pixel & 0xff);//G
            }
        }

        //导入待加密机密文件
        FileInputStream fis = new FileInputStream(textPath);
        int byteLen = fis.available();
        byte[] buf = new byte[byteLen];
        fis.read(buf);


        //我用两个字节(16位)表示数据部分的长度，也就是说，图像转像素点后，前16个像素点的R对应的字节的最低有效位都是默认表示数据字节数组的长度
        //规定，数据的长度最大为2^16-1
        int[] bufLen = new int[2];
        bufLen[0] = (byteLen & 0xff00) >> 8;
        bufLen[1] = (byteLen & 0xff);
        for (int i = 0; i < 2; i++) {
            for (int j = 7; j >= 0; j--) {
                int h = (i * 8 + (7 - j)) / width;
                int w = (i * 8 + (7 - j)) % width;
                //只取每个像素点的R，的字节的最低位
                if ((bufLen[i] >> j & 1) == 1) {
                    rgb[w][h][0] = rgb[w][h][0] | 1;
                } else {
                    rgb[w][h][0] = rgb[w][h][0] & 0xe;
                }
            }
        }

        //按照规则将数据的二进制序列全部放到每一个像素点的第一个字节的最后一位上
        for (int i = 2; i < byteLen + 2; i++) {
            for (int j = 7; j >= 0; j--) {
                //高
                int h = (i * 8 + (7 - j)) / width;
                //宽
                int w = (i * 8 + (7 - j)) % width;
                if ((buf[i - 2] >> j & 1) == 1) {
                    //变1
                    rgb[w][h][0] = rgb[w][h][0] | 1;
                } else {
                    rgb[w][h][0] = rgb[w][h][0] & 0xe;
                }
            }
        }
        //        构建通过编码生成的png图片的类型
        BufferedImage imageOutput = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                int[] color = new int[3];
                color[0] = rgb[w][h][0] << 16;
                color[1] = rgb[w][h][1] << 8;
                color[2] = rgb[w][h][2];
                int pixel = 0xff000000 | color[0] | color[1] | color[2];
                imageOutput.setRGB(w, h, pixel);
            }
        }
        ImageIO.write(imageOutput, "png", new File(imageOutputPath));
    }

    public static void LSBDecoder(String imageInputPath, String textFilePath) throws IOException {
        BufferedImage imageInput = ImageIO.read(new File(imageInputPath));
        int width = imageInput.getWidth();
        int height = imageInput.getHeight();
        int[] bufLen = new int[2];
        //将图像每个点的像素(R,G,B)存储在数组中
        for (int i = 0; i < 2; i++) {
            int[] bits = new int[8];
            for (int j = 7; j >= 0; j--) {
                int h = (i * 8 + (7 - j)) / width;
                int w = (i * 8 + (7 - j)) % width;
                int pixel = imageInput.getRGB(w, h);
                int r = (pixel & 0xff0000) >> 16;
                bits[j] = (r & 1) << j;
            }
            bufLen[i] = bits[7] | bits[6] | bits[5] | bits[4] | bits[3] | bits[2] | bits[1] | bits[0];
        }
        int byteLen = ((bufLen[0] << 7) | bufLen[1]);
//        System.out.println(byteLen);
        byte[] buf = new byte[byteLen];
        for (int i = 2; i < byteLen + 2; i++) {
            int[] bits = new int[8];
            for (int j = 7; j >= 0; j--) {
                int h = (i * 8 + (7 - j)) / width;
                int w = (i * 8 + (7 - j)) % width;
                int pixel = imageInput.getRGB(w, h);
                int r = (pixel & 0xff0000) >> 16;
                bits[j] = (r & 0x1) << j;
            }
            buf[i - 2] = (byte) (bits[7] | bits[6] | bits[5] | bits[4] | bits[3] | bits[2] | bits[1] | bits[0]);
        }
//        System.out.println(new String(buf));
        FileOutputStream fos = new FileOutputStream(textFilePath);
        fos.write(buf);
        fos.close();
    }
}
