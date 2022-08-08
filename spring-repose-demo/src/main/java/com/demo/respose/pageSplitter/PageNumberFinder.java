package com.demo.respose.pageSplitter;

import com.aspose.words.LayoutCollector;
import com.aspose.words.Node;

import java.util.Hashtable;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/8 14:39
 */
public class PageNumberFinder {
    private Hashtable mNodeStartPageLookup = new Hashtable();

    private Hashtable mNodeEndPageLookup = new Hashtable();

    private Hashtable mReversPageLookup;

    private LayoutCollector mCollector;


    public PageNumberFinder(LayoutCollector mCollector) {
        this.mCollector = mCollector;
    }

    /**
     * 获取页数
     *
     * @param node
     * @return
     * @throws Exception
     */
    public int getPage(Node node) throws Exception {
        if (mNodeStartPageLookup.containsKey(node)) {
            return (Integer) mNodeStartPageLookup.get(node);
        }
        return mCollector.getEndPageIndex(node);
    }
}
