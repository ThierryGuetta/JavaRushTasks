package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        if (args.length > 0 && args[0].equals("-c")) {
            BufferedReader br = new BufferedReader(new FileReader(path));
            List<String> strings = new ArrayList<>();
            String text;
            while ((text = br.readLine()) != null) {
                strings.add(text);
            }
            br.close();

            int max = 0;
            for (String string : strings) {
                String lastLine = string.substring(0, 8);
                int id = Integer.parseInt(lastLine.trim());
                if (id > max) max = id;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(max + 1);
            while (sb.length() < 8) {
                sb.append(" ");
            }
            String idItem = sb.toString();

            sb = new StringBuilder(args[1]);
            while (sb.length() < 30) {
                sb.append(" ");
            }
            String nameItem = sb.toString();

            sb = new StringBuilder(args[2]);
            while (sb.length() < 8) {
                sb.append(" ");
            }
            String priceItem = sb.toString();

            sb = new StringBuilder(args[3]);
            while (sb.length() < 4) {
                sb.append(" ");
            }
            String quantityItem = sb.toString();


            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write("\n" + idItem + nameItem + priceItem + quantityItem);
            bw.close();
        }
    }
}

