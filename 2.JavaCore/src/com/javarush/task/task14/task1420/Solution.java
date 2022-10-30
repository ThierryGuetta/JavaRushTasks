package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(nod(a, b));
    }

    private static int nod(int a, int b) {
        if (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
            return nod(a, b);
        } else return a + b;
    }
}