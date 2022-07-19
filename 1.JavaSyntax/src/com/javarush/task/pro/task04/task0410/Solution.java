package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
                }
            }
        while (scanner.hasNextInt()) {
            int num2 = scanner.nextInt();
            if (num2 > min && num2 < min2) {
                min = num2;
            }
        }
        System.out.println(min2);
    }
}