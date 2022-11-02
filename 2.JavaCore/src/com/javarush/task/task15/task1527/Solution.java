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
        url = url.replace("?", " ");
        url = url.replace("&", " ");
        String[] strings = url.split(" ");

        double d = 0;
        String c = "";

        for (int i = 1; i < strings.length; i++) {
            if (!strings[i].contains("=")) {
                System.out.print(strings[i] + " ");
                continue;
            }
            String[] str = strings[i].split("=");
            if (str[0].equals("obj") && (str[1].matches("-?[0-9]+[.][0-9]+") || str[1].matches("-?[0-9]+"))) {
                d = Double.parseDouble(str[1]);
            } else if (str[0].equals("obj")) c = str[1];
            System.out.print(str[0] + " ");
        }

        System.out.println();
        if (d != 0) alert(d);
        else if(!c.equals(""))alert(c);
    }
}
