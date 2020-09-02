package com.io.readFiles;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @Author rope
 * @Date 2020/9/2 10:59
 * @Version 1.0
 */
public class ReadFile {

    @Test
    void test1() throws IOException {
        //第一种 使用Scanner
        //可以按行读取 按分隔符去读取文件数据
        String fileName = "D:\\playground\\test\\newFile6.txt";
        try(Scanner sc = new Scanner(new FileReader(fileName))){
            while (sc.hasNextLine()){ //按行读取字符串
                String line = sc.nextLine();
                System.out.println(line);
            }
        }

        try(Scanner sc = new Scanner(new FileReader(fileName))){
            sc.useDelimiter("\\|");
            while (sc.hasNextLine()){ //按行读取字符串
                String line = sc.next();
                System.out.println(line);
            }
        }
    }

    @Test
    void test2() throws IOException {
        String fileName = "D:\\playground\\test\\newFile7.txt";
        //读取文件内容到Stream流中 按行读取
        Stream<String> lines = Files.lines(Paths.get(fileName));
        //lines.forEach(ele -> System.out.println(ele));

        ////按文件行顺序进行处理
        //lines.forEachOrdered(System.out::println);
    }

    @Test
    void test3() throws IOException {
        String fileName = "D:\\playground\\test\\newFile3.txt";
        //转换成List<String>,要注意超出内存的错误
        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        lines.forEach(System.out::println);
    }

    @Test
    void test4() throws IOException {
        String fileName = "D:\\playground\\test\\newFile3.txt";
        //先将数据读取为二进制数组，然后转换为String内容

        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);
    }

    @Test
    void test5() throws IOException {
        String fileName = "D:\\playground\\test\\newFile3.txt";
        //管道流
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }

        //java8可以这么写
        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
    }

}
