package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.ImageReader;

/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(null);
    }
}
