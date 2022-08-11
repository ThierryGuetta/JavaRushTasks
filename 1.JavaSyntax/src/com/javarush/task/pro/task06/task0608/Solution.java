package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long a = 3;
        System.out.println(cube(a));
    }

    public static long cube(long a) {
        long b = a * a * a;
        return b;
    }
}
