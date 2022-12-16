package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()))) {

            String string;
            while ((string = br2.readLine()) != null) {
                string = string.replaceAll("[\\p{Punct}\\r\\n]", "");
                bw.write(string);
            }
        }
    }
}
