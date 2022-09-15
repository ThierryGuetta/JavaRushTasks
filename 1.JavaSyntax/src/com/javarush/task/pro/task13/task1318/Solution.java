package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] array = Month.values();
        if (month.ordinal() == array.length - 1) return array[0];
        else return array[month.ordinal() + 1];
    }
}

