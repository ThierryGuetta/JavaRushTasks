package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toLowerCase();
        String b = secret.toLowerCase();
        boolean c = a.equals(b);
        if (c)
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}