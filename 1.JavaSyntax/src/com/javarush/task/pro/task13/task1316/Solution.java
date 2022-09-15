package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] array = JavarushQuest.values();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].ordinal());
        }
    }
}
