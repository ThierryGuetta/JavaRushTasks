package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.setName("Ivan");
        System.out.println(cat.getName());
    }

    public static void main(String[] args) {

    }
    public static class Cat{
        public String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
