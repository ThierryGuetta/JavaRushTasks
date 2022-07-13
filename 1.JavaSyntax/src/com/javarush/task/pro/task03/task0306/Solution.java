package com.javarush.task.pro.task03.task0306;

import java.awt.*;
import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}





