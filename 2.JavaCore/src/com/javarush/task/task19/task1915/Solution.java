package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream(br.readLine());
        br.close();
        PrintStream ps = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        testString.printSomething();
        System.setOut(ps);
        System.out.println(baos);
        fos.write(baos.toByteArray());
        fos.close();
    }

    public static class TestString {

        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

