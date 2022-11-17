package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        int spaces = 0;
        int sum = 0;
        while (fr.ready()) {
            sum++;
            int chars = fr.read();
            if (chars == (int) ' ') spaces++;
        }
        double res = (double) spaces / sum * 100;
        fr.close();
        System.out.printf("%.2f", res);
    }
}
