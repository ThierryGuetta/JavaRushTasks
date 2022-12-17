package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
                TreeMap<String, Double> file = new TreeMap<>();
                double value = 0;
                String line;
                while ((line = br.readLine()) != null) {
                    String[] splitLine = line.split(" ");
                    if (file.containsKey(splitLine[0])) {
                        value = file.get(splitLine[0]) + Double.parseDouble(splitLine[1]);
                    } else {
                        value = Double.parseDouble(splitLine[1]);
                    }
                    file.put(splitLine[0], value);
                }
                for (Map.Entry<String, Double> entry : file.entrySet()) {
                    if (value == entry.getValue()) System.out.println(entry.getKey());
                }
            }
        }
    }
}
