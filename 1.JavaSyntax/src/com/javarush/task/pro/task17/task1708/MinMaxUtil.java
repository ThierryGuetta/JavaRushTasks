package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxUtil {

    public static int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }

    public static int min(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        Arrays.sort(array);
        return array[0];
    }

    public static int min(int num1, int num2, int num3, int num4) {
        int[] array = {num1, num2, num3, num4};
        Arrays.sort(array);
        return array[0];
    }

    public static int min(int num1, int num2, int num3, int num4, int num5) {
        int[] array = {num1, num2, num3, num4, num5};
        Arrays.sort(array);
        return array[0];
    }

    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int max(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int max(int num1, int num2, int num3, int num4) {
        int[] array = {num1, num2, num3, num4};
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int max(int num1, int num2, int num3, int num4, int num5) {
        int[] array = {num1, num2, num3, num4, num5};
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
