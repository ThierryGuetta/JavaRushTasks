package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;


/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String ALPHABET_PART_ONE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        FileReader fr = new FileReader(args[0]);
        int num = 0;
        while (fr.ready()) {
            char ch = (char) fr.read();
            if (ALPHABET_PART_ONE.contains(Character.toString(ch))) num++;
        }
        fr.close();
        System.out.println(num);
    }
}

