package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/*

Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(scanner.nextLine()));

        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            bw.write(text + "\n");
            if (text.equals("exit")) break;
        }
        scanner.close();
        bw.close();
    }
}