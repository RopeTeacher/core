package com.io.createFile;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
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
    void testCreateFile() throws IOException {
        String filename = "D:\\playground\\test\\newFile.txt";

        Path path = Paths.get(filename);
        //使用newBufferedWriter创建文件并写入文件
        //使用try无需手动关闭
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write("Hello World!! 创建文件");
        }

        //追加写模式
        try(BufferedWriter writer = Files.newBufferedWriter(path,StandardCharsets.UTF_8, StandardOpenOption.APPEND)){
            writer.append("追加写");
        }
    }

}
