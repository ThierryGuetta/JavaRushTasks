package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path1 = br.readLine();
        String path2 = br.readLine();
        br.close();

        try (FileInputStream fis = new FileInputStream(path1);
             FileOutputStream fos = new FileOutputStream(path1);
             FileInputStream fis2 = new FileInputStream(path2)) {

            byte[] array = new byte[fis.available()];

            while (fis.available() > 0) {
                byte[] bytes = new byte[fis.available()];
                fis.read(bytes);
                array = bytes;
            }

            while (fis2.available() > 0) {
                byte[] bytes = new byte[fis2.available()];
                fis2.read(bytes);
                fos.write(bytes);
            }
            fos.write(array);
        }
    }
}