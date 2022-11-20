package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path1;
        String path2 = "";
        TreeSet<String> treeSet = new TreeSet<>();

        while (true) {
            path1 = br.readLine(); //читаем путь к файлу или end
            String[] array = path1.split("\\."); // проверяем, что файл заканчивается на partN
            if (path1.equals("end") || !array[array.length - 1].startsWith("part")) break;
            else {
                path2 = path1;
                treeSet.add(path2); //добавляю пути к файлам в дерево для сортировки
            }
        }

        String[] array = path2.split("\\."); //здесь я создаю путь в той же директории
        array[array.length - 1] = ""; //беру путь последнего считанного файла, удаляя [.partN]
        StringBuilder result = new StringBuilder(); //склеиваем строку
        for (String s : array) {
            result.append(s).append(".");
        }
        while(result.charAt(result.length() - 1) == '.') result.deleteCharAt(result.length() - 1);

        try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(result.toString()))) {
            for (String value : treeSet) { //пролистываю дерево с путями
                try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(value));) {
                    while (fis.available() > 0) { //читаю байты из файлов
                        byte[] bytes = new byte[fis.available()]; //использую буффер
                        int count = fis.read(bytes);
                        fos.write(bytes); //записываю байты из буффера в файл
                    }
                }
            }
        }
    }
}