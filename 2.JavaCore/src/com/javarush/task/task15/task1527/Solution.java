package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        showOptions(url);
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static void showOptions(String url) {

        url = url.replace("?", " ").replace("&", " ");
        String[] strings = url.split(" ");
        String result = null;

        for (int i = 1; i < strings.length; i++) {
            String[] str = strings[i].split("=");
            if (str[0].equals("obj")) result = str[1];
            System.out.print(str[0] + " ");
        }
        System.out.println();
        if (result != null) {
            try {
                alert(Double.parseDouble(result));
            } catch (Exception e) {
                alert(result);
            }
        }
    }
}
