package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (Cat.class.equals(o.getClass())) {
            System.out.println("Кошка");
        } else if (Dog.class.equals(o.getClass())) {
            System.out.println("Собака");
        } else if (Bird.class.equals(o.getClass())) {
            System.out.println("Птица");
        } else if (Lamp.class.equals(o.getClass())) {
            System.out.println("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
