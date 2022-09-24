package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path1 = Path.of(str);
        if (path1.isAbsolute()) System.out.println(path1);
        else {
            System.out.println(path1.toAbsolutePath());
        }
    }
}

