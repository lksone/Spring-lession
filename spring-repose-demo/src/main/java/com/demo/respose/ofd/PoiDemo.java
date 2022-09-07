package com.demo.respose.ofd;

import org.apache.poi.hpsf.*;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/5 17:08
 */
public class PoiDemo {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Administrator\\Desktop\\1.vsd";
        PropertySet mps = new PropertySet();
        Section ms = mps.getSections().get(0);
        ms.setFormatID(SummaryInformation.FORMAT_ID);
        Property p = new Property();
        p.setID(PropertyIDMap.PID_TITLE);
        p.setType(Variant.VT_LPWSTR);
        p.setValue("Sample title");
        ms.setProperty(p);
        try (POIFSFileSystem poiFs = new POIFSFileSystem();
             InputStream is = mps.toInputStream();
             FileOutputStream fos = new FileOutputStream(fileName)) {
            poiFs.createDocument(is, SummaryInformation.DEFAULT_STREAM_NAME);
            poiFs.writeFilesystem(fos);
        } catch (WritingNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
