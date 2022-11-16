package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(br.readLine())) {

            ArrayList<Integer> list = new ArrayList<>();

            while (fis.available() > 0) {
                list.add(fis.read());
            }

            HashSet<Integer> set = new HashSet<>(list);

            list.clear();
            list.addAll(set);
            list.sort(Integer::compareTo);

            for(Integer e : list){
                System.out.print(e + " ");
            }
        }
    }
}