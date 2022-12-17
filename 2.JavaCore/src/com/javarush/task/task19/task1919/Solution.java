package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
                TreeMap<String, Double> file = new TreeMap<>();
                String line;
                while ((line = br.readLine()) != null) {
                    String[] splitLine = line.split(" ");
                    if (file.containsKey(splitLine[0])) {
                        file.put(splitLine[0], file.get(splitLine[0]) + Double.parseDouble(splitLine[1]));
                    } else
                        file.put(splitLine[0], Double.parseDouble(splitLine[1]));
                }
                for (Map.Entry<String, Double> entry : file.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        }
    }
}
