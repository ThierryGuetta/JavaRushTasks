package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null) {
            return new String("");
        }

        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();

        char[] chars = br.readLine().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((byte) chars[i] + key);
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
