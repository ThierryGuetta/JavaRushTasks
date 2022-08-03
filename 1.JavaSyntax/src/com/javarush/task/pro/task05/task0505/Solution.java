package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 1) System.out.println(array[i]);
            if (array.length % 2 == 0) System.out.println(array[array.length - 1 - i]);
        }
    }
}
