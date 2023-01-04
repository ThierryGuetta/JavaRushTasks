package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {
    private static int files = 0;
    private static int direct = 0;
    private static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(br.readLine());

        if (!Files.isDirectory(path)) {
            System.out.println(path + " - не папка");
            return;
        }

        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                if (attrs.isDirectory()) direct++;
                return super.preVisitDirectory(dir, attrs);
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (attrs.isRegularFile()) {
                    files++;
                    size += attrs.size();
                }
                return super.visitFile(file, attrs);
            }
        });

        System.out.println("Всего файлов - " + files);
        System.out.println("Всего папок - " + (direct - 1));
        System.out.println("Общий размер - " + size);
    }
}


