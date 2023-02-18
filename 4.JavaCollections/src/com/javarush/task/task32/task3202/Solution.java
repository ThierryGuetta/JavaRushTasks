package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        if (is == null) {
            return new StringWriter();
        }
        BufferedInputStream bis = new BufferedInputStream(is);
        byte[] bytes = new byte[bis.available()];
        while (bis.available() > 0) {
            int c = bis.read(bytes);
        }
        StringWriter sw = new StringWriter();
        sw.write(new String(bytes));

        return sw;
    }
}
