package com.demo.respose.excel;

import com.aspose.cells.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * excel的項目修改和增加
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/9 14:44
 */
public class ExcelDemo {

    /**
     * 指定类型转换
     *
     * @param excelUrl      excel保存路径
     * @param pdfUrl        PDF保存路径
     * @throws Exception    异常
     */
    public static void excelToPdf(String excelUrl,String pdfUrl) {
        try {
            long old = System.currentTimeMillis();
            // 原始excel路径
            Workbook wb = new Workbook(excelUrl);
            FileOutputStream fileOS = new FileOutputStream(new File(pdfUrl));
            wb.save(fileOS, com.aspose.cells.SaveFormat.PDF);
            fileOS.close();
            long now = System.currentTimeMillis();
            //转化用时
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒");
        } catch (Exception e) {
            System.out.println("文档数据转换失败");
            e.printStackTrace();
        }
    }

    /**
     * 打开加密文件
     */
    public static void openWorkbook95() {
        try {
            LoadOptions loadOptions = new LoadOptions(LoadFormat.EXCEL_97_TO_2003);
            loadOptions.setPassword("1234");
            Workbook workbook = new Workbook("excel95.xls",loadOptions);
            workbook.save("excel95.xls", SaveFormat.EXCEL_97_TO_2003);
            System.out.println("是否可以打開");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void readCell(){
        try {
            Workbook workbook = new Workbook("excel95.xls");
            for (Object worksheet : workbook.getWorksheets()) {
                Worksheet sheet = (Worksheet) worksheet;
                for (Object cell : sheet.getCells()) {
                    Cell cell1 = (Cell) cell;
                    if(cell1!=null){
                        System.out.println("行："+(cell1.getRow()+1)+",列："+(cell1.getColumn()+1));
                        System.out.println(cell1.getValue());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取属性
     *      1、自定义属性；
     *      2、文档本身的属性
     */
    public static void getWorkbookCustomerProperties() {
        try {
          //  Workbook workbook = new Workbook("excel95.xls");
            Workbook workbook = new Workbook("excel.xlsx");
            //获取内置文档属性
            for (Object builtInDocumentProperty : workbook.getBuiltInDocumentProperties()) {
                DocumentProperty property = (DocumentProperty) builtInDocumentProperty;
                System.out.println(property.getName()+":"+property.getValue());
            }
            //文檔自定義属性
            System.out.println("------------------------------------------------------------");
            for (Object customDocumentProperty : workbook.getCustomDocumentProperties()) {
                DocumentProperty property = (DocumentProperty) customDocumentProperty;
                System.out.println(property.getName()+":"+property.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加自定义属性信息
     */
    public static void addWorkbookCustomerProperties(){
        try {
            Workbook workbook = new Workbook("excel95.xls");
            workbook.getCustomDocumentProperties().add("screct",1123);
            workbook.save("excel95.xls");
            System.out.println(workbook.getCustomDocumentProperties().get("screct"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * xlsx转换pdf
     * @throws Exception
     */
    public static void xlsxToPdf() throws Exception {
        //创建workbook 的对象
        Workbook workbook = new Workbook();
        WorksheetCollection worksheets = workbook.getWorksheets();
        worksheets.add("1");
        worksheets.add("2");
        worksheets.add("3");
        Cell cellInPage1 = worksheets.get(0).getCells().get("A1");
        Cell cellInPage2 = worksheets.get(1).getCells().get("B1");
        Cell cellInPage3 = worksheets.get(2).getCells().get("A1");
        cellInPage1.setValue("a");
        cellInPage2.setValue("b");
        cellInPage3.setValue("c");
        PdfBookmarkEntry pbeRoot = new PdfBookmarkEntry();
        pbeRoot.setText("root");
        pbeRoot.setDestination(cellInPage1);
        pbeRoot.setOpen(false);
        PdfBookmarkEntry subPbe1 = new PdfBookmarkEntry();
        subPbe1.setText("1");
        subPbe1.setDestination(cellInPage2);
        PdfBookmarkEntry subPbe2 = new PdfBookmarkEntry();
        subPbe2.setText("2");
        subPbe2.setDestination(cellInPage3);
        ArrayList subEntryList = new ArrayList();
        subEntryList.add(subPbe1);
        subEntryList.add(subPbe2);
        pbeRoot.setSubEntry(subEntryList);
        PdfSaveOptions options = new PdfSaveOptions();
        options.setBookmark(pbeRoot);
        workbook.save("testpdf.pdf", options);
    }

    /**
     * 插入图片信息
     * @throws Exception
     */
    public static void addImageToExcel() throws Exception {
        Workbook wb = new Workbook("excel.xlsx");
        Worksheet worksheet = wb.getWorksheets().get(0);
        //設置圖片
        int add = worksheet.getPictures().add(1, 1, "123.jpeg");
        //插入图片信息
        Picture picture = worksheet.getPictures().get(add);
        picture.setHeight(100);
        picture.setWidth(100);
        picture.setBorderLineColor(new Color());
        picture.setBorderWeight(5);
        //自由浮動
        picture.setPlacement(PlacementType.MOVE_AND_SIZE);
        wb.save("outputTextureFill_IsTiling.xlsx");
    }

    /**
     * 添加image excel todo 待定
     * @throws Exception
     */
    public static void addImageToExcel2() throws Exception {
        Workbook workbook = new Workbook();
        Worksheet worksheet = workbook.getWorksheets().get(0);
        worksheet.getCells().get("A1").putValue(50);
        worksheet.getCells().get("A2").putValue(100);
        worksheet.getCells().get("A3").putValue(150);
        worksheet.getCells().get("B1").putValue(60);
        worksheet.getCells().get("B2").putValue(32);
        worksheet.getCells().get("B3").putValue(50);
        int chartIndex = worksheet.getCharts().add(ChartType.PYRAMID_BAR, 5, 0, 25, 10);
        //chart 的数据添加
        Chart chart = worksheet.getCharts().get(chartIndex);
        chart.getNSeries().add("A1:B3", true);
        chart.getNSeries().get(0).getDataLabels().setShowValue(true);
        ChartShape chartShape = chart.getChartObject();
        //设置右下列
        chartShape.setLowerRightColumn(10);
        //设置 X
        chartShape.setLowerDeltaX(1024);
        workbook.save("book1.xls");
    }

    public static void main(String[] args) throws Exception {
        addImageToExcel2();
        System.out.println("執行成功");
    }
}
