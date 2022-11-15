package com.javarush.task.task17.task1721;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 20; i++) {
            list2.add(i);
        }
        list2.removeAll(list);
        System.out.println(list);

        System.out.println(list2);
    }
}
