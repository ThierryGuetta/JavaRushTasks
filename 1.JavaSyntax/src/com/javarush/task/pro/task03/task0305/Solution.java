package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        if (a == b && b != c) {
            System.out.println(a + " " + b);
        }
        if (b == c && a != c) {
            System.out.println(b + " " + c);
        }
        if (a == c && a != b) {
            System.out.println(a + " " + c);
        }
    }
}
