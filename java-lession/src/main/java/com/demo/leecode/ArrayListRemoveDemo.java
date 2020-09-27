package com.demo.leecode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author lks
 * @date 2020-09-22 21:33
 * @email 1056224715@qq.com
 * @Description arrayList remove报错
 */
public class ArrayListRemoveDemo {

    private static final ArrayList<String> list = new ArrayList<>();

    static {
        list.add("1");
        list.add("4");
        list.add("3");
        list.add("2");
    }

    /**
     * 异常信息
     *
     * @param sources
     */
    private static List<String> remove(List<String> sources) {
        for (String msg : sources) {
            if ("2".equals(msg)) {
                sources.remove(msg);
            }
        }
        return sources;
    }


    public static void main(String[] args) {

     /*   List<String> remove = remove(list);
        System.out.println(remove);*/

        //2. 删除数据
        list.add(null);
        list.add("1");
        list.add(null);
        list.add("2");
        list.add(null);
        list.add("21");
        System.out.println(list);
        list.remove(null);
        System.out.println(list);
    }
}
