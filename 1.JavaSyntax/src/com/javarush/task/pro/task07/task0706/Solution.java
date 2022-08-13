package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        double c = 100.0 / 0.0;
        double d = 100.0 / 0.0;
        div(c, d);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
