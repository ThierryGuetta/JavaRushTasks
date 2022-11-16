package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        int minByte = 128;
        while(fis.available() > 0){
            int bytes = fis.read();
            if(bytes < minByte) minByte = bytes;
        }
        br.close();
        fis.close();
        System.out.println(minByte);
    }
}
