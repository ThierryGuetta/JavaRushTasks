package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
        FileWriter fw = new FileWriter(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while(br2.ready()){
            list.addAll(Arrays.asList(br2.readLine().split(" ")));
            for (String s : list) {
                sb.append((int) Math.round(Double.parseDouble(s))).append(" ");
            }
        }
        fw.write(sb.toString());
        br2.close();
        fw.close();
    }
}
