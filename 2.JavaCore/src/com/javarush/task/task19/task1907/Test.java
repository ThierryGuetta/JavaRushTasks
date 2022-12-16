package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file = new BufferedReader(new FileReader(br.readLine()))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = file.readLine()) != null) {
                sb.append(line).append(" ");
            }
            int count = 0;
            String res = sb.toString().toString().replaceAll("\\p{P}", " ");
            String[] strings = res.split(" ");
            for (String s : strings) {
                if (s.equalsIgnoreCase("world")) count++;
            }
            System.out.println(count);
        }
    }
}
