package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String doubleNums = "[-?0-9]+.[0-9]+";
            String intNums = "[-?0-9]+";

            if (str.equals("exit")) break;
            else if (!str.matches(doubleNums) && !str.matches(intNums)) print(str.toString());
            else if (str.contains(".")) print(Double.parseDouble(str));
            else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128) print(Short.parseShort(str));
            else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128) print(Integer.parseInt(str));
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
