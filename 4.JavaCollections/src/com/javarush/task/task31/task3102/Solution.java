package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File file = new File(root);
        List<String> paths = new ArrayList<>();
        Queue<File> queue = new PriorityQueue<>();

        Collections.addAll(queue, file.listFiles());

        while (!queue.isEmpty()) {
            File currentFIle = queue.remove();
            if (currentFIle.isDirectory()) {
                Collections.addAll(queue, currentFIle.listFiles());
            } else paths.add(currentFIle.getAbsolutePath());
        }
        return paths;
    }

    public static void main(String[] args) {

    }
}
