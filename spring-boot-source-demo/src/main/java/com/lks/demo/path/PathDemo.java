package com.lks.demo.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Author lks
 * @E-mail 13552418058@163.com
 * @Since 1.0
 * @Date 2022/10/17 11:38
 */
public class PathDemo {


    public static void main(String[] args) {
        String dirName ="E:\\temp";
        //过滤出目录
        try (Stream<Path> paths = Files.walk(Paths.get(dirName),2)) {
            paths.filter(Files::isDirectory)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //按后缀名过滤
        try (Stream<Path> paths = Files.walk(Paths.get(dirName), 2)) {
            paths.map(path -> path.toString()).filter(f -> f.endsWith(".png"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
