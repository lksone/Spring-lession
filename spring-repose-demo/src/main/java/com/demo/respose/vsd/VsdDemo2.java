package com.demo.respose.vsd;

import org.apache.poi.hpsf.*;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/5 17:44
 */
public class VsdDemo2 {


    public static void main(String[] args) throws IOException {
        method();
    }

    public static void method() throws IOException {
        File summaryFile = new File("C:\\Users\\Administrator\\Desktop\\2.vsd");
        try (POIFSFileSystem poifs = new POIFSFileSystem(summaryFile, false)) {
            DirectoryEntry dir = poifs.getRoot();
            SummaryInformation si;
            try {
                si = (SummaryInformation) PropertySetFactory.create(dir, SummaryInformation.DEFAULT_STREAM_NAME);
            } catch (FileNotFoundException | NoPropertySetStreamException ex) {
                si = PropertySetFactory.newSummaryInformation();
            }
            assert (si != null);
            DocumentSummaryInformation dsi;
            try {
                dsi = (DocumentSummaryInformation) PropertySetFactory.create(
                        dir, DocumentSummaryInformation.DEFAULT_STREAM_NAME);
            } catch (NoPropertySetStreamException | IOException ex) {
                dsi = PropertySetFactory.newDocumentSummaryInformation();
            }
            assert (dsi != null);
            CustomProperties customProperties = dsi.getCustomProperties();
            if (customProperties == null) {
                customProperties = new CustomProperties();
            }
            for (int i = 0; i < dsi.getCustomProperties().size(); i++) {
            }
            customProperties.put("Key 1", "Value 1");
            customProperties.put("Schl\u00fcssel 2", "Wert 2");
            customProperties.put("Sample Number", 12345);
            customProperties.put("Sample Boolean", Boolean.TRUE);
            customProperties.put("Sample Date", new Date());
            customProperties.put("lks", new Date());
            /* Read a custom property. */
            Object value = customProperties.get("Sample Number");
            Object lks = customProperties.get("lks");
            System.out.println("Custom Sample Number is now " + value);
            System.out.println("Custom Sample Number is now " + lks);
            dsi.setCustomProperties(customProperties);
            si.write(dir, SummaryInformation.DEFAULT_STREAM_NAME);
            dsi.write(dir, DocumentSummaryInformation.DEFAULT_STREAM_NAME);
            poifs.writeFilesystem();
        } catch (WritingNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
