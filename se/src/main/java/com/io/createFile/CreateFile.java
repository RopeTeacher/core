package com.io.createFile;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author rope
 * @Date 2020/9/1 23:08
 * @Version 1.0
 */
public class CreateFile {

    @Test
    void testCreateFile1() throws IOException {
        String filename = "D:\\playground\\test\\newFile.txt";

        Path path = Paths.get(filename);
        //使用ewBufferedWriter创建文件并写入文件
        //使用try无需手动关闭
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write("Hello World!! 创建文件");
        }

        //追加写模式
        try(BufferedWriter writer = Files.newBufferedWriter(path,StandardCharsets.UTF_8, StandardOpenOption.APPEND)){
            writer.append("追加写");
        }
    }

    @Test
    void testCreateFile2() throws IOException {
        String filename = "D:\\playground\\test\\newFile2.txt";
        //JDK1.7开始的方法
        //不需要使用流 只需要通过Files的write传递文件的路径，内容以及格式
        Files.write(Paths.get(filename),"Hello World!! 创建文件".getBytes(StandardCharsets.UTF_8));
        //追加写模式
        Files.write(Paths.get(filename),"追加写".getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
    }

    @Test
    void testCreateFiles3() throws FileNotFoundException, UnsupportedEncodingException {
        //jdk5 PrintWriter
        String filename = "D:\\playground\\test\\newFile3.txt";
        try (PrintWriter printWriter = new PrintWriter(filename,"utf-8")){
            //一行一行写
            printWriter.println("Hello World");
            printWriter.println("追加写");
        }
    }

    @Test
    void testCreateFiles4() throws IOException {
        String filename = "D:\\playground\\test\\newFile4.txt";
        File file = new File(filename);
        if(file.createNewFile()){
            System.out.println("Ok");
        }else {
            System.out.println("No");
        }
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Hello World");
        }
    }

    @Test
    void testCreateFiles5() throws IOException {
        String filename = "D:\\playground\\test\\newFile5.txt";
        try (FileOutputStream fos = new FileOutputStream(filename);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)){
             bw.write("Hello World");
             bw.flush();
        }
    }
}
