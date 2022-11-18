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
        ArrayList<byte[]> byteList = new ArrayList<>();

        while (true) {
            path1 = br.readLine(); //читаем путь к файлу или end
            String[] array = path1.split("\\."); // проверяем, что файл заканчивается на partN
            if (path1.equals("end") || !array[array.length - 1].startsWith("part")) break;
            else {
                path2 = path1;
                FileInputStream fis = new FileInputStream(path2);
                while (fis.available() > 0) {
                    byte[] bytes = new byte[fis.available()];
                    int count = fis.read(bytes); //читаем байты в массив
                    byteList.add(bytes); // и передаем его в список таких же массивов
                }
                fis.close();
            }
        }

        String[] array = path2.split("\\.");
        array[array.length - 1] = "";
        StringBuilder result = new StringBuilder();
        for (String s : array) {
            result.append(s).append("."); //result - путь к директории
        }

        FileOutputStream fos = new FileOutputStream(result.toString());

        for (byte[] bytes : byteList){ //создаем новый файл и записываем в него все байты из 3х файлов
            fos.write(bytes);
        }
        fos.close();
    }
}