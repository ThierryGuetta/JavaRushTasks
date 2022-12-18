package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 2) {
            try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String s : words) {
                        if (s.length() > 6) sb.append(s).append(",");
                    }
                }
                bw.write(sb.deleteCharAt(sb.length() - 1).toString());
            }
        }
    }
}
