package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boutles = scanner.nextInt();
        int persones = scanner.nextInt();
        double coke = boutles * 1.0 / persones;
        System.out.println(coke);
    }
}