package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        testString.printSomething();
        System.setOut(ps);
        String str = baos.toString();
        String[] strings = str.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        switch (strings[1]) {
            case "+":
                System.out.println(str + (a + b));
                break;
            case "-":
                System.out.println(str + (a - b));
                break;
            case "*":
                System.out.println(str + (a * b));
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

