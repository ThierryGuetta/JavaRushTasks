package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // min = 8 secondMin = 4 min = 4 secondMin = 8
        int min = scanner.nextInt();
        int secondMin = scanner.nextInt();
        if ( min > secondMin){
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (scanner.hasNextInt()){ //  4 8 -5 3
            int number = scanner.nextInt();
            if ( min == secondMin && number > secondMin){
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            } else if (number > min && number < secondMin) {
                secondMin = number;
            }

        }






        System.out.println(secondMin);
    }
}