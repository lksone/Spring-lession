package com.demo.respose.excel;

import com.aspose.cells.*;

/**
 *
 * 水印
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/9 14:52
 */
public class ExcelWatermark {


    public static void removeWatermarkPrinter(){
        try {
            Workbook wb = new Workbook("watermark.xlsx");
            Worksheet ws = wb.getWorksheets().get(0);
            int cnt = ws.getShapes().getCount();
            for (int i = cnt-1; i >=0; i--) {
                com.aspose.cells.Shape shape = ws.getShapes().get(i);
                if (shape.isWordArt()) {
                    ws.getShapes().addArc(1,100,1,100,100,100);
                }
            }
            wb.save("watermark.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加watermark
     */
    public static void addWatermarkPrinter(){
        try {
            Workbook workbook = new Workbook();
            Worksheet sheet = workbook.getWorksheets().get(0);
            Shape wordart = sheet
                    .getShapes()
                    .addTextEffect(MsoPresetTextEffect.TEXT_EFFECT_1, "这是一个水印信息",
                    "Arial Black", 50, false, true,
                            18, 8, 1, 1, 130, 800);
            //填写格式
            FillFormat wordArtFormat = wordart.getFill();
            wordArtFormat.setOneColorGradient(Color.getRed(), 0.2, GradientStyleType.HORIZONTAL, 2);
            wordArtFormat.setTransparency(0.9);
            LineFormat lineFormat = wordart.getLine();
            lineFormat.setWeight(0.0);
            workbook.save("ArtWToWorksheet_out.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("添加水印完成");
    }

    public static void main(String[] args) {
        addWatermarkPrinter();
    }
}
