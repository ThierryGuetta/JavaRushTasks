package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(scanner.nextLine())));
        ArrayList<Integer> list = new ArrayList<>();

        while (br.ready()) {
            list.add(Integer.parseInt(br.readLine()));
        }
        scanner.close();
        br.close();

        list.stream().sorted((s1, s2) -> s1 - s2).filter(s1 -> s1 % 2 == 0).forEach(System.out::println);
    }
}
