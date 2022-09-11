package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (this.capacity * 1.5);
        String[] elements = new String[capacity];
        for (int i = 0; i < this.elements.length; i++) {
            elements[i] = this.elements[i];
        }
        this.elements = elements;
    }
}
