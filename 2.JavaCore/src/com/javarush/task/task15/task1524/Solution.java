package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    static {
        System.out.println("static void init()"); //1
    }

    {
        System.out.println("Non-static block"); //4
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor"); //8
        printAllFields(this);
    }

    public static void init() {
        System.out.println("Static block");
    } //2

    public static void main(String[] args) {
        System.out.println("public static void main"); //3
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields"); //5 //9
        System.out.println(obj.i);//6 //10
        System.out.println(obj.name);//7 //11

    }
}
