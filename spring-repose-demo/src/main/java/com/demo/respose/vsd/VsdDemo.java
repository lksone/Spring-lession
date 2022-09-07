package com.demo.respose.vsd;

import com.aspose.diagram.*;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/9/2 18:19
 */
public class VsdDemo {


    public static void main(String[] args) throws XPathExpressionException, ParserConfigurationException, IOException, SAXException {
        String xml = "<example xmlns:x=\"http://example.com/example/\">"
                + "<x:Object attr=\"obj1attrvalue\">object 1</x:Object>"
                + "<x:Object attr=\"obj2attrvalue\">object 2</x:Object>"
                + "</example>";
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilderFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new InputSource(new StringReader(xml)));
        Element docEl = doc.getDocumentElement();
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPathBuilder = xPathFactory.newXPath();
        xPathBuilder.setNamespaceContext(new MyNamespaceContext());
        XPathExpression xPath = xPathBuilder.compile("//x:Object//@*");
        NodeList nodeList = (NodeList) xPath.evaluate(docEl, XPathConstants.NODESET);
        System.out.println("nodeList length=" + nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("nodeList[" + i + "]=" + node);
        }
    }

    private static final class MyNamespaceContext implements NamespaceContext {

        @Override
        public String getNamespaceURI(String prefix) {
            return null;
        }

        @Override
        public String getPrefix(String namespaceURI) {
            return null;
        }

        @Override
        public Iterator getPrefixes(String namespaceURI) {
            return null;
        }
    }

    private static void addDiagram() {
        Diagram dgrm = null;
        try {
            dgrm = new Diagram("C:\\Users\\Administrator\\Desktop\\132.vsdx");
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < dgrm.getPages().getCount(); i++) {
                Page page = dgrm.getPages().getPage(i);
                for (int j = 0; j < page.getShapes().getCount(); j++) {
                    Shape shape = page.getShapes().get(j);
                    String data1 = shape.getData1();
                    FormatTxtCollection value = shape.getText().getValue();
                    String text = value.getText();
                    if (StringUtils.isNotBlank(text)) {
                        sb.append(text);
                    }
                    TextXForm textXForm = shape.getTextXForm();
                    double value1 = textXForm.getTxtWidth().getValue();
                    double value2 = textXForm.getTxtHeight().getValue();
                    System.out.println("长：" + value1 + "宽：" + value2);

                    System.out.println("------------------------------------------");

                    XForm xForm = shape.getXForm();
                    DoubleValue height = xForm.getHeight();
                    DoubleValue width = xForm.getWidth();
                    System.out.println("长：" + width.getValue() + "宽：" + height.getValue());
                    System.out.println("------------------------------------------");
                }
            }
            dgrm.save("C:\\Users\\Administrator\\Desktop\\output.vsdx", SaveFileFormat.VSDX);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dgrm != null) {
                dgrm.dispose();
            }
        }
    }
}
