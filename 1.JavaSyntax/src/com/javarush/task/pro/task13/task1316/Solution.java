package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] jq = JavarushQuest.values();
        for (JavarushQuest javarushQuest : jq) {
            System.out.println(javarushQuest.ordinal());
        }
    }
}
