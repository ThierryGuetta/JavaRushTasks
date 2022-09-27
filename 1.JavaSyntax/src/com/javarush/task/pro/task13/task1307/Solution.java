package com.javarush.task.pro.task13.task1307;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 2
*/

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 10));
        }
        System.out.println("original " + integers);
        reverse(integers);
        System.out.println("reverse " + integers);
        sort(integers);
        System.out.println("sort " + integers);
        rotate(integers, 1);
        System.out.println("rotate " + integers);
        shuffle(integers);
        System.out.println("shuffle " + integers);

    }
}
