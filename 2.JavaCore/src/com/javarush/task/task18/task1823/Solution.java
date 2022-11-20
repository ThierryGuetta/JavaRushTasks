package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path;
        while (!(path = br.readLine()).equals("exit")) {
            new ReadThread(path).start();
        }
    }


    public static class ReadThread extends Thread {
        private String path;

        public ReadThread(String fileName) {
            path = fileName;
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> map = new HashMap<>();

            try (FileInputStream fis = new FileInputStream(path)) {
                while (fis.available() > 0) {
                    int count = fis.read();
                    if (map.containsKey(count)) map.replace(count, map.get(count), map.get(count) + 1);
                    else map.put(count, 1);
                }

            } catch (IOException e) {
                throw new RuntimeException();
            }
            int value = 0;
            for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
                if (maps.getValue() > value) value = maps.getValue();
            }
            for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
                if (maps.getValue() != value) map.replace(maps.getKey(), 0);
            }
            int key = 258;
            for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
                if (maps.getValue() != 0 && maps.getKey() < key) key = maps.getKey();

            }
            resultMap.put(path, key);
        }
    }
}
