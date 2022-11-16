package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(br.readLine())) {

            HashMap<Integer, Integer> map = new HashMap<>();

            while (fis.available() > 0) {
                int bytes = fis.read();
                if (map.containsKey(bytes)) {
                    map.replace(bytes, map.get(bytes), map.get(bytes) + 1);
                } else {
                    map.put(bytes, 1);
                }
            }

            int value = 0;
            for (Map.Entry<Integer, Integer> e: map.entrySet()) {
                if(e.getValue() > value) value = e.getValue();
            }
            for(Map.Entry<Integer, Integer> e: map.entrySet()) {
                if(e.getValue() == value) System.out.print(e.getKey() + " ");
            }
        }
    }
}
