package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        FileWriter fw = new FileWriter(path);
        String text;
        while ((text = br.readLine()) != null) {
            strings.add(text);
        }
        for (String s : strings) {
            System.out.println(s);
        }
        br.close();
        fw.close();
    }
}
