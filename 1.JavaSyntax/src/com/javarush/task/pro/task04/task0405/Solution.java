package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 20) {
                if(x == 0 || x == 9) {
                    System.out.print("");
                }else if (y == 0 || y == 19){
                    System.out.print("B");
                }else {
                    System.out.print(" ");
                }
                y++;
            }
            System.out.println();
            x++;
        }
    }
}