package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        int maxByte = 0;
        while(fis.available() > 0){
            int bytes = fis.read();
            if(bytes > maxByte) maxByte = bytes;
        }
        br.close();
        fis.close();
        System.out.println(maxByte);
    }
}
