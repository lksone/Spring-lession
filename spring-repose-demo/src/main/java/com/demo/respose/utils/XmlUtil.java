package com.demo.respose.utils;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.Iterator;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/10 16:07
 */
public class XmlUtil {

    private XmlUtil(){}


    public static String getFileHeader( File file) {
        InputStream is = null;
        String value = null;
        try {
            is = new FileInputStream(file);
            byte[] b = new byte[4];
            is.read(b, 0, b.length);
            value = bytesToHexString(b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

    private static String bytesToHexString(byte[] src) {
        StringBuilder builder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        String hv;
        for (byte b : src) {
            hv = Integer.toHexString(b & 0xFF).toUpperCase();
            if (hv.length() < 2) {
                builder.append(0);
            }
            builder.append(hv);
        }
        return builder.toString();
    }

    public static void method(){
        String xml = "<root><flw><name>aa</name><age>22</age><instance_info><num>1</num><code>0</code><instance><ip>10.1.1.2</ip><mask>9999</mask></instance><instance><ip>10.1.1.5</ip><mask>717</mask></instance></instance_info><instance_info><num>2</num><code>33</code><instance><ip>10.1.1.2</ip><mask>9999</mask></instance><instance><ip>10.1.1.9</ip><mask>878</mask></instance></instance_info></flw></root>";
        long start = System.currentTimeMillis();
        SAXReader reader = new SAXReader();
        try {
            org.dom4j.Document doc = reader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
            org.dom4j.Element root = doc.getRootElement();
            org.dom4j.Element element;
            org.dom4j.Element element2;
            org.dom4j.Element element3;
            for (Iterator i = root.elementIterator("flw"); i.hasNext();) {
                element = (org.dom4j.Element) i.next();
                System.out.println("name:[" + element.elementText("name") + "]");
                System.out.println("age:[" + element.elementText("age") + "]");
                for (Iterator j = element.elementIterator("instance_info"); j.hasNext();) {
                    element2 = (org.dom4j.Element) j.next();
                    System.out.println("\tnum:[" + element2.elementText("num") + "]");
                    System.out.println("\tcode:[" + element2.elementText("code") + "]");
                    for (Iterator k = element2.elementIterator("instance"); k.hasNext();) {
                        element3 = (org.dom4j.Element) k.next();
                        System.out.println("\t\tip:[" + element3.elementText("ip") + "]");
                        System.out.println("\t\tmask:[" + element3.elementText("mask") + "]");
                    }
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    public static void main(String[] args) {
        method();
    }
}
