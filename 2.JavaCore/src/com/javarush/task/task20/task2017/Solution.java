package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {
        try {
            Object obj = objectStream.readObject();
            if (obj instanceof A) {
                return (A) obj;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("error");
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
