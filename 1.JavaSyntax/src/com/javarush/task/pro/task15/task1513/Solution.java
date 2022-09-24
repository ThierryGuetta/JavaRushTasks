package com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path1 = Path.of(str);
        System.out.println(path1.getRoot());
    }
}

