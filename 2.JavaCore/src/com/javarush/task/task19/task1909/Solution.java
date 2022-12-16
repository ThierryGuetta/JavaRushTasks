package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()))) {

            int symbol;
            while((symbol = br2.read()) != -1){
                if(symbol == 46) symbol = 33;
                bw.write(symbol);
            }
        }
    }
}
