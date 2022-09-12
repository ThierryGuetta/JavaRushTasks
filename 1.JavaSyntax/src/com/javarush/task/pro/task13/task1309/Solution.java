package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ivan", 2.4);
        grades.put("Oleg", 2.5);
        grades.put("Sasha", 2.6);
        grades.put("Andrey", 2.7);
        grades.put("Olya", 2.8);
    }
}
