package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {

        if (binaryNumber == null || binaryNumber.equals("")) return "";
        for (int i = 0; i < binaryNumber.length(); i++) {
            char check = binaryNumber.charAt(i);
            if (check != '0' && check != '1') return "";
        }

        StringBuilder builder = new StringBuilder(binaryNumber);
        while ((binaryNumber.length() % 4 != 0)) builder.append("0").append(binaryNumber);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < builder.length(); i += 4) {
            String string = builder.substring(i, i + 4);
            String element = "";
            if (string.equals("0000")) element = "0";
            else if (string.equals("0001")) element = "1";
            else if (string.equals("0010")) element = "2";
            else if (string.equals("0011")) element = "3";
            else if (string.equals("0100")) element = "4";
            else if (string.equals("0101")) element = "5";
            else if (string.equals("0110")) element = "6";
            else if (string.equals("0111")) element = "7";
            else if (string.equals("1000")) element = "8";
            else if (string.equals("1001")) element = "9";
            else if (string.equals("1010")) element = "a";
            else if (string.equals("1011")) element = "b";
            else if (string.equals("1100")) element = "c";
            else if (string.equals("1101")) element = "d";
            else if (string.equals("1110")) element = "e";
            else if (string.equals("1111")) element = "f";
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) return "";
        if (!Pattern.matches("[0-9a-f]+", hexNumber)) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String result = "";
            char subChar = hexNumber.charAt(i);
            if (subChar == '0') result = "0000";
            else if (subChar == '1') result = "0001";
            else if (subChar == '2') result = "0010";
            else if (subChar == '3') result = "0011";
            else if (subChar == '4') result = "0100";
            else if (subChar == '5') result = "0101";
            else if (subChar == '6') result = "0110";
            else if (subChar == '7') result = "0111";
            else if (subChar == '8') result = "1000";
            else if (subChar == '9') result = "1001";
            else if (subChar == 'a') result = "1010";
            else if (subChar == 'b') result = "1011";
            else if (subChar == 'c') result = "1100";
            else if (subChar == 'd') result = "1101";
            else if (subChar == 'e') result = "1110";
            else if (subChar == 'f') result = "1111";
            builder.append(result);
        }
        return builder.toString();
    }
}
