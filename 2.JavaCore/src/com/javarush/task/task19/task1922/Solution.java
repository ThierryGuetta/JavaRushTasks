package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()))) {
            String str;
            while ((str = br2.readLine()) != null) {
                int index = 0;
                String[] strings = str.split(" ");
                for (String s : words) {
                    for (String d : strings) {
                        if (s.equals(d)) index++;
                    }
                }
                if (index == 2) System.out.println(str);
            }
        }
    }
}
