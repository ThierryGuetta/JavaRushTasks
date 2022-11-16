package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(br.readLine());
             FileOutputStream fos1 = new FileOutputStream(br.readLine()); FileOutputStream fos2 = new FileOutputStream(br.readLine())) {

            if (fis.available() > 0) {
                byte[] buffer = new byte[fis.available()];
                int num = fis.read(buffer);
                if (num % 2 == 0) {
                    for (int i = 0; i < buffer.length / 2; i++) {
                        fos1.write(buffer[i]);
                        fos2.write(buffer[buffer.length / 2 + i]);
                    }
                } else {
                    for (int i = 0; i < buffer.length / 2 + 1; i++) {
                        fos1.write(buffer[i]);
                    }
                    for (int i = buffer.length / 2 + 1; i < buffer.length; i++) {
                        fos2.write(buffer[i]);
                    }
                }
            }
        }
    }
}


