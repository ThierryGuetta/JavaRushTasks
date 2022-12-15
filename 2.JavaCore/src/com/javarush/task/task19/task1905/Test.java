package com.javarush.task.task19.task1905;

public class Test {
    public static void main(String[] args) {
        String phone = "+38(050)123-45-67";
        System.out.println(phone.replaceAll("[()-]",""));
    }
}
