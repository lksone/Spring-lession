package com.lks.demo.fileLister;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

/**
 * 文件夾监听时间
 * @Author lks

 * @Since 1.0
 * @Date 2022/10/12 16:34
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        FileAlterationObserver observer = new FileAlterationObserver("E:\\temp");
        FileAlterationMonitor monitor = new FileAlterationMonitor(1);
        FileAlterationListener listener = new FileAlterationListenerAdaptor() {
            @Override
            public void onFileCreate(File file) {
                // code for processing creation event
                System.out.println("文件创建成功：fileName="+file.getName());
            }

            @Override
            public void onFileDelete(File file) {
                // code for processing deletion event
                System.out.println("文件删除成功：fileName="+file.getName());
            }

            @Override
            public void onFileChange(File file) {
                // code for processing change event
                System.out.println("文件发生修改：fileName="+file.getName());
            }
        };
        observer.addListener(listener);
        monitor.addObserver(observer);
        monitor.start();
    }
}
