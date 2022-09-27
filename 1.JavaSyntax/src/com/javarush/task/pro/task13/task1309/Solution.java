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
        grades.put("Alex", 5.9);
        grades.put("Andrey", 5.9);
        grades.put("Misha", 5.9);
        grades.put("Ivan", 5.9);
        grades.put("Petr", 5.9);
    }
}
