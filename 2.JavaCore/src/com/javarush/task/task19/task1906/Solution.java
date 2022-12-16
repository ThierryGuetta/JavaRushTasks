package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()))) {

            int letter;
            int index = 1;
            while ((letter = br2.read()) != -1) {
                if (index % 2 == 0) {
                    bw.write(letter);
                }
                index++;
            }
        }
    }
}
