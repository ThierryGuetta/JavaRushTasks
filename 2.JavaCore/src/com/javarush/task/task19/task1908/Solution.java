package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()))) {

            String line;
            while ((line = br2.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String s : numbers) {
                    boolean flag = true;
                    for (int i = 0; i < s.length(); i++) {
                        if (!Character.isDigit(s.charAt(i))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        bw.write(s + " ");
                    }
                }
            }
        }
    }
}