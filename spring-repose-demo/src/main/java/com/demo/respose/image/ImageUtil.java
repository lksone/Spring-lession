package com.demo.respose.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/8 11:41
 */
public class ImageUtil {

    public static void main(String[] args) throws IOException {
        String targetPath = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\pexels-andrea-garibay-13221178.jpg";
        String waterPath = "D:\\workspace5\\Spring-lession\\spring-repose-demo\\testFile\\1662521435103.png";
        imageInsertWaterToImage(targetPath, waterPath, 10, 10, 30, 50);
    }

    /**
     * 删除水印
     *
     * @param targetPath 是否存在水印数据信息
     */
    private static void imageDeleteWaterImage(String targetPath) {
        String clearName = targetPath.substring(targetPath.lastIndexOf("-merge-"), targetPath.lastIndexOf('.'));
        String originalImagePath = targetPath.replace(clearName, "");
        // 清除水印后删除水印图片
        File fileImg = new File(targetPath);
        if (fileImg.isFile()) {
            fileImg.delete();
        }
    }

    /**
     * 图片中插入图片
     *
     * @param targetPath 图片目标路径
     * @param waterPath  水印图片路径
     * @param x          X
     * @param y          Y
     * @param width      图片长度
     * @param height     图片宽度
     */
    private static void imageInsertWaterToImage(String targetPath, String waterPath, int x, int y, int width, int height) {
        FileOutputStream outImgStream = null;
        try {
            //1、目标文件对象转化为图片对象
            Image srcImg = ImageIO.read(new File(targetPath));
            int srcImgHeight = srcImg.getHeight(null);
            int srcImgWidth = srcImg.getWidth(null);
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            // 2、加水印
            //2.1、创建画笔
            Graphics2D graphics = bufImg.createGraphics();
            //绘制原始图片，原始画布
            graphics.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            //-------------------------图片水印 start----------------------------
            // 3、水印文件
            Image srcWaterMark = ImageIO.read(new File(waterPath));
            ImageLister imageLister = new ImageLister();
            //获取水印图片的宽度
            int widthWaterMark = srcWaterMark.getWidth(null);
            //获取水印图片的高度
            int heightWaterMark = srcWaterMark.getHeight(null);
            //设置 alpha 透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
            graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.5f));
            //绘制水印图片  坐标为中间位置
            graphics.drawImage(srcWaterMark, x, y, width, height, imageLister);
            // 水印文件结束
            graphics.dispose();
            //-------------------------图片水印 end----------------------------
            // 输出图片
            outImgStream = new FileOutputStream(targetPath);
            String fileType = targetPath.substring(targetPath.lastIndexOf(".") + 1);
            ImageIO.write(bufImg, fileType, outImgStream);
            System.out.println("添加水印完成");
            outImgStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outImgStream != null) {
                try {
                    outImgStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取水印文字的长度
     *
     * @param waterMarkContent 水印字体和航都
     * @param graphics2D       图片信息
     * @return
     */
    public static int getWatermarkLength(String waterMarkContent, Graphics2D graphics2D) {
        return graphics2D.getFontMetrics(graphics2D.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }
}
