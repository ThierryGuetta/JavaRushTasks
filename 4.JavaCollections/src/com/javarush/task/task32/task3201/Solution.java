package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {

        try (RandomAccessFile raf = new RandomAccessFile(new File(args[0]), "rw")) {
            long size = raf.length();
            long seek = Long.parseLong(args[1]);
            byte[] text = args[2].getBytes();
            if (size >= seek) {
                raf.seek(seek);
                raf.write(text);
            } else {
                raf.seek(size);
                raf.write(text);
            }
        }
    }
}
