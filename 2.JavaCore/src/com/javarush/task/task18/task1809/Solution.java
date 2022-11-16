package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(br.readLine());
             FileOutputStream fos = new FileOutputStream(br.readLine())) {
            while (fis.available() > 0) {
                byte[] array = new byte[fis.available()];
                fis.read(array);
                for (int i = array.length - 1; i >= 0; i--) {
                    fos.write(array[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
