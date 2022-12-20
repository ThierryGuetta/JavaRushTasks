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

            ArrayList<String> fileList1 = new ArrayList<>();
            ArrayList<String> fileList2 = new ArrayList<>();
            String line;
            while ((line = file1.readLine()) != null) {
                fileList1.add(line);
            }
            while ((line = file2.readLine()) != null) {
                fileList2.add(line);
            }

            for (int i = 0; i < Math.max(fileList1.size(), fileList2.size()); i++) {
                if (fileList1.size() > i + 1 && fileList2.size() > i + 1) {
                    if (!fileList1.get(i).equals(fileList2.get(i)) &&
                            fileList1.get(i).equals(fileList2.get(i + 1))) {
                        fileList1.add(i, null);
                    } else if (!fileList1.get(i).equals(fileList2.get(i)) &&
                            !fileList1.get(i).equals(fileList2.get(i + 1))) {
                        fileList2.add(i, null);
                    }
                }
            }

            if (fileList1.size() > fileList2.size()) fileList2.add(null);
            else if (fileList2.size() > fileList1.size()) fileList1.add(null);

            for (int i = 0; i < fileList1.size(); i++) {
                if (fileList1.get(i) != null &&
                        fileList2.get(i) != null &&
                        fileList1.get(i).equals(fileList2.get(i))) {
                    lines.add(new LineItem(Type.SAME, fileList1.get(i)));
                } else if (fileList2.get(i) == null) {
                    lines.add(new LineItem(Type.REMOVED, fileList1.get(i)));
                } else if (fileList1.get(i) == null) {
                    lines.add(new LineItem(Type.ADDED, fileList2.get(i)));
                }
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
