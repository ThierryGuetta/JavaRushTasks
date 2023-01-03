package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 2) {
            File directory = new File(args[0]);
            File file = new File(args[1]);
            File updFile = new File(file.getParentFile() + "\\allFilesContent.txt");

            if (FileUtils.isExist(file)) FileUtils.renameFile(file, updFile);
            FileUtils.deleteFile(file);

            Queue<File> queue = new PriorityQueue<>();
            Collections.addAll(queue, directory.listFiles());

            BufferedReader br = null;
            BufferedWriter bw = new BufferedWriter(new FileWriter(updFile));

            while (!queue.isEmpty()) {
                File currentFile = queue.remove();
                if (currentFile.isDirectory()) Collections.addAll(queue, currentFile.listFiles());
                else if (currentFile.length() <= 50) {
                    br = new BufferedReader(new FileReader(currentFile));
                    while (br.ready()) {
                        bw.write(br.readLine() + "\n");
                    }
                }
            }
            if (br != null) br.close();
            bw.close();
        }
    }
}
