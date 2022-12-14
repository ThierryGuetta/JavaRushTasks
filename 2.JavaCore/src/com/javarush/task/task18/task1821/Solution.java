package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            Map<Character, Integer> tree = new TreeMap<>();
            int c;
            while ((c = br.read()) != -1) {
                char letter = (char) c;
                if (tree.containsKey(letter)) {
                    tree.put(letter, tree.get(letter) + 1);
                } else {
                    tree.put(letter, 1);
                }
            }
            br.close();
            Iterator<Character> key = tree.keySet().iterator();
            Iterator<Integer> value = tree.values().iterator();

            while (key.hasNext() && value.hasNext()) {
                System.out.println(key.next() + " " + value.next());
            }
        }
    }
}

