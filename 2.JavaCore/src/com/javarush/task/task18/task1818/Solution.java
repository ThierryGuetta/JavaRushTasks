package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(br.readLine());
             FileInputStream fis = new FileInputStream(br.readLine());
             FileInputStream fis2 = new FileInputStream(br.readLine())) {

            while (fis.available() + fis2.available() > 0) {
                byte[] bytes = new byte[fis.available()];
                fos.write(bytes, 0, fis.read(bytes));
                if (fis.available() > 0) continue;
                bytes = new byte[fis2.available()];
                fos.write(bytes, 0, fis2.read(bytes));
            }
        }
    }
}
