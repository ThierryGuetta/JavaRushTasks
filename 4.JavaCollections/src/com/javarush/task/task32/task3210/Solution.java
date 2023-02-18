package com.javarush.task.task32.task3210;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            raf.seek(Integer.parseInt(args[1]));
            byte[] fileBytes = new byte[args[2].length()];
            raf.read(fileBytes, 0, args[2].length());
            String two = new String(fileBytes);
            raf.seek(raf.length());
            if (two.equals(args[2])) {
                raf.write("true".getBytes());
            } else raf.write("false".getBytes());
        }
    }
}