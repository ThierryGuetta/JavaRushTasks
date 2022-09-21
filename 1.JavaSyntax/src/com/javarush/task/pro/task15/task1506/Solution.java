package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //1) Scanner
        //2)
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
        for (String string : list){

            System.out.println(string.replaceAll("[,.\\s]", ""));
        }
    }
}

