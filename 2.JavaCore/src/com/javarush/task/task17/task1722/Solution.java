package com.javarush.task.task17.task1722;

/* 
Посчитаем
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter(); //создаем нить 1
        Counter counter2 = new Counter(); //создаем нить 2
        Counter counter3 = new Counter(); //создаем нить 3
        Counter counter4 = new Counter(); //создаем нить 4

        counter1.start(); //запускаем нить 1
        counter2.start(); //запускаем нить 2
        counter3.start(); //запускаем нить 3
        counter4.start(); //запускаем нить 4
        counter1.join();
        counter2.join();
        counter3.join();
        counter4.join();

        for (int i = 1; i <= 100; i++) {
            if (values[i] != 1) {
                System.out.println("Массив values содержит элементы неравные 1");
                break;
            }
        }
        //System.out.println(Arrays.toString(values));
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            do {
                synchronized (values) {
                    incrementCount();
                    values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            } while (getCount() < 100);
        }
    }
}
