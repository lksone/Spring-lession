package com.demo.servializer;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 查看arraylist的序列化数据
 */
public class ArrayListSerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> stringList = new ArrayList<String>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("hollis");
        stringList.add("chuang");
        System.out.println("init StringList" + stringList);

        //序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("stringlist"));
        objectOutputStream.writeObject(stringList);
        IOUtils.closeQuietly(objectOutputStream);

        File file = new File("stringlist");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        List<String> newStringList = (List<String>) objectInputStream.readObject();
        IOUtils.closeQuietly(objectInputStream);
        if (file.exists()) {
            file.delete();
        }
        System.out.println("new StringList" + newStringList);

    }
}
