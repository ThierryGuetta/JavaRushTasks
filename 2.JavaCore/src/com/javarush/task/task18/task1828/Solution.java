package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/
/*
1)Считать все строки файла и сохранить его в список
2)Из каждой строки в списке, сохранить в строку первые 8 символов
3) Проверить эту строку на совпадение с args 1
4) Когда найдется совпадение, надо изменить эту строку добавив args 2 3
с добавлением нужного кол-ва пробелов
5)Заменить исходную на новую и переписать весь файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(path));

        String text;
        while ((text = br.readLine()) != null) {
            strings.add(text);
        }
        br.close();
        if (args[0].equals("-u")) {
            for (int i = 0; i < strings.size(); i++) {
                String id = strings.get(i).substring(0, 8).trim();
                if (id.equals(args[1])) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    while (sb.length() < 8) {
                        sb.append(" ");
                    }
                    String idItem = sb.toString();

                    sb = new StringBuilder(args[2]);
                    while (sb.length() < 30) {
                        sb.append(" ");
                    }
                    String nameItem = sb.toString();

                    sb = new StringBuilder(args[3]);
                    while (sb.length() < 8) {
                        sb.append(" ");
                    }
                    String priceItem = sb.toString();

                    sb = new StringBuilder(args[4]);
                    while (sb.length() < 4) {
                        sb.append(" ");
                    }
                    String quantityItem = sb.toString();
                    strings.set(i, idItem + nameItem + priceItem + quantityItem);
                }

            }
            FileWriter fw = new FileWriter(path);
            for (String s : strings) {
                fw.write(s + "\n");
            }
            fw.close();
        } else if (args[0].equals("-d")) {
            for (int i = 0; i < strings.size(); i++) {
                String id = strings.get(i).substring(0, 8).trim();
                if (id.equals(args[1])) {
                    strings.remove(i);
                    break;
                }
            }
            FileWriter fw = new FileWriter(path);
            for (String s : strings) {
                fw.write(s + "\n");
            }
            fw.close();
        }
    }
}
