package com.demo.respose.word;

import com.aspose.words.*;

import java.io.*;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * PDF文件转换为图片
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/8 10:32
 */
public class DemoImage {

    /**
     * 获取凭证 word
     * @return
     */
    private static boolean getLicense() {
        boolean result = false;
        try {
            // 凭证
            String license =
                    "<License>\n" +
                            "  <Data>\n" +
                            "    <Products>\n" +
                            "      <Product>Aspose.Total for Java</Product>\n" +
                            "      <Product>Aspose.Words for Java</Product>\n" +
                            "    </Products>\n" +
                            "    <EditionType>Enterprise</EditionType>\n" +
                            "    <SubscriptionExpiry>20991231</SubscriptionExpiry>\n" +
                            "    <LicenseExpiry>20991231</LicenseExpiry>\n" +
                            "    <SerialNumber>8bfe198c-7f0c-4ef8-8ff0-acc3237bf0d7</SerialNumber>\n" +
                            "  </Data>\n" +
                            "  <Signature>sNLLKGMUdF0r8O1kKilWAGdgfs2BvJb/2Xp8p5iuDVfZXmhppo+d0Ran1P9TKdjV4ABwAgKXxJ3jcQTqE/2IRfqwnPf8itN8aFZlV3TJPYeD3yWE7IT55Gz6EijUpC7aKeoohTb4w2fpox58wWoF3SNp6sK6jDfiAUGEHYJ9pjU=</Signature>\n" +
                            "</License>";
            InputStream is = new ByteArrayInputStream(license.getBytes("UTF-8"));
            License asposeLic = new com.aspose.words.License();
            asposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 文档转换为pdf 文档
     *
     * @throws Exception
     */
    public static void wordToPdf() throws Exception {
        //获取文档流，所需要转为PDF的Word文档
        String fromPath = "李科胜_java开发工程师.docx";
        InputStream stream = new FileInputStream(fromPath);
        //指定文档，将word转换为pdf文档
        Document convertDoc = new Document(stream);
        //转为PDF的路径
        String toPath = "aa.pdf";
        convertDoc.save(toPath , SaveFormat.PDF);
        //saveFormat此处的saveFormat在一下有解释
    }

    /**
     * word转换为doc
     * @throws Exception
     */
    public static void wordToMark() throws Exception {
        //获取文档流,所需要转为PDF的Word文档
        String fromPath = "李科胜_java开发工程师.docx";
        InputStream stream = new FileInputStream(fromPath);
        Document convertDoc = new Document(stream);
        //转为PDF的路径
        String toPath = "Mark.pdf";
        convertDoc.getRange().getBookmarks().get("mark").setText("填充的数据");
        convertDoc.save(toPath , SaveFormat.PDF);
    }

    /**
     * t
     * @throws Exception
     */
    public static void writeData() throws Exception {
        Document doc = new Document();
        CustomDocumentProperties properties = doc.getCustomDocumentProperties();
        properties.add("Authorized", true);
        properties.add("Authorized By", "John Doe");
        properties.add("Authorized Date", new Date());
        properties.add("Authorized Revision", doc.getBuiltInDocumentProperties().getRevisionNumber());
        properties.add("Authorized Amount", 123.45);
        Iterator<DocumentProperty> enumerator = properties.iterator();
        while (enumerator.hasNext()) {
            DocumentProperty property = enumerator.next();
            System.out.println(MessageFormat.format("Name: \"{0}\"\n\tType: \"{1}\"\n\tValue: \"{2}\"", property.getName(), property.getType(), property.getValue()));
        }
        DocumentBuilder builder = new DocumentBuilder(doc);
        //修改数据信息
        FieldDocProperty field = (FieldDocProperty) builder.insertField(" DOCPROPERTY \"Authorized By\"");
        field.update();
        doc.save("cc.doc");
        properties.removeAt(1);
        properties.remove("Authorized Revision");
        properties.clear();

    }

    public static void readData(){

    }
    public static void main(String[] args) throws Exception {

        System.out.println(method("bb.docx"));
    }

    public static String method(String fileName) throws Exception {

        FileFormatInfo fileFormatInfo = FileFormatUtil.detectFileFormat("");
        String fileType = "Undetermined";
        final File file = new File(fileName);
        try
        {
            fileType = Files.probeContentType(file.toPath());
        }
        catch (IOException ioException)
        {
            System.out.println(
                    "ERROR: Unable to determine file type for " + fileName
                            + " due to exception " + ioException);
        }
        return fileType;

    }
}
