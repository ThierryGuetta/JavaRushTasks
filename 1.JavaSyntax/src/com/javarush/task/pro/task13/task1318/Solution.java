package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        if (month.ordinal() < 11) return months[month.ordinal() + 1];
        else return months[0];
    }
}
