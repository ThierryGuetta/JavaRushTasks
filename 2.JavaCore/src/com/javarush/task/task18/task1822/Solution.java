package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(scanner.nextLine()));
        String text;
        while((text = br.readLine()) != null){
            if(text.startsWith(args[0] + " ")) break;
        }
        br.close();
        System.out.println(text);
    }
}
