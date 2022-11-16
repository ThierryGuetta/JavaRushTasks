package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                FileInputStream fis = new FileInputStream(br.readLine());
                if (fis.available() < 1000) {
                    fis.close();
                    throw new DownloadException();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class DownloadException extends Exception {

    }
}
