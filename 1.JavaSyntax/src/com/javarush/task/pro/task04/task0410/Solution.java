package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 9999;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}