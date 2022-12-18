package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()))) {
            String str;
            StringBuilder sb = new StringBuilder();
            while ((str = br2.readLine()) != null) {
                sb.append(str);
                System.out.println(sb.reverse());
                sb.delete(0, str.length());
            }
        }
    }
}
