package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file1 = new BufferedReader(new FileReader(br.readLine()));
             BufferedReader file2 = new BufferedReader(new FileReader(br.readLine()))) {

            ArrayList<String> firstFile = new ArrayList<>();
            ArrayList<String> secondFile = new ArrayList<>();
            String line;
            while ((line = file1.readLine()) != null) {
                firstFile.add(line);
            }
            while ((line = file2.readLine()) != null) {
                secondFile.add(line);
            }

            while (firstFile.size() < secondFile.size()) firstFile.add("~");
            while (firstFile.size() > secondFile.size()) secondFile.add("~");
            firstFile.add("~");
            secondFile.add("~");

            for (int i = 0; i < firstFile.size() - 2; i++) {
                if (firstFile.get(i).equals(secondFile.get(i + 1))) firstFile.add(i, "~");
                else if (firstFile.get(i + 1).equals(secondFile.get(i))) secondFile.add(i, "~");
            }
            for (int i = 0; i < firstFile.size() - 1; i++) {
                if (firstFile.get(i).equals("~") && secondFile.get(i).equals("~")) continue;
                if (firstFile.get(i).equals(secondFile.get(i)))
                    lines.add(new LineItem(Type.SAME, firstFile.get(i).trim()));
                else if (firstFile.get(i).equals("~")) lines.add(new LineItem(Type.ADDED, secondFile.get(i)));
                else if (secondFile.get(i).equals("~")) lines.add(new LineItem(Type.REMOVED, firstFile.get(i).trim()));
            }
        }
        System.out.println(lines);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return line + " " + type + "\n";
        }
    }
}
