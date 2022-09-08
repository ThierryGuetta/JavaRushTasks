package com.javarush.task.pro.task12.task1205;

/* 
Метод деления
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        double x = Double.NaN;
        double z = Double.POSITIVE_INFINITY;
        double y = Double.NEGATIVE_INFINITY;

        if (a > 0 && b == 0) System.out.println(z);
        else if (a == z && b >= 0 && b != z) System.out.println(z);
        else if (a == y && b < 0 && b != y) System.out.println(z);

        else if (a < 0 && b == 0) System.out.println(y);
        else if (a == y && b >= 0 && b != z) System.out.println(y);
        else if (a == z && b < 0 && b != y) System.out.println(y);

        else if (a == 0 && b == 0) System.out.println(x);
        else if (a == x || b == x) System.out.println(x);
        else if (a == z && b == z) System.out.println(x);
        else if (a == z && b == y) System.out.println(x);
        else if (a == y && b == z) System.out.println(x);
        else if (a == y && b == y) System.out.println(x);
        else System.out.println(a / b);

    }
}

