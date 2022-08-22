package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String number = "";
        if (decimalNumber <= 0) return number;
        char[] array = HEX.toCharArray();
        while (decimalNumber != 0) {
            number = array[decimalNumber % 16] + number;
            decimalNumber = decimalNumber / 16;
        }
        return number;
    }

    public static int toDecimal(String hexNumber) {
        int number = 0;
        if (hexNumber == null || hexNumber.equals("")) return number;
        char[] array = HEX.toCharArray();
        for (int i = 0; i < hexNumber.length(); i++) {
            number = 16 * number + HEX.indexOf(hexNumber.charAt(i));
        }
        return number;
    }
}
