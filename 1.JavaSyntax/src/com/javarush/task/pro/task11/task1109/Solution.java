package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner c = new Outer().new Inner();
        Outer.Nested b = new Outer.Nested();
    }
}
