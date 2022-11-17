package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.Buffer;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String path = br.readLine();
            try (FileInputStream fis = new FileInputStream(path)) {
            } catch (FileNotFoundException e) {
                System.out.println(path);
                break;
            }
        }
    }
}
