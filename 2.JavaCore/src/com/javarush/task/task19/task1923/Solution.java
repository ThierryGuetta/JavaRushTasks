package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if(args.length == 2){
            try(BufferedReader br = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))){
                String line;
                while((line = br.readLine()) != null){
                    String[] array = line.split(" ");
                    for (String s : array) {
                        boolean flag = false;
                        for (int i = 0; i < s.length(); i++) {
                            if(Character.isDigit(s.charAt(i))){
                                flag = true;
                                break;
                            }
                        }if(flag){
                            bw.write(s + " ");
                        }
                    }
                }
            }
        }
    }
}
