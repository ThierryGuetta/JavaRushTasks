package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new myThread1());
        threads.add(new myThread2());
        threads.add(new myThread3());
        threads.add(new myThread4());
        threads.add(new myThread5());
    }

    public static void main(String[] args) {
    }
}

class myThread1 extends Thread {

    @Override
    public void run() {
        while (true) {
        }
    }
}

class myThread2 extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("hello");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
}

class myThread3 extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class myThread4 extends Thread implements Message {

    @Override
    public void run() {
        while (!isInterrupted()) {
        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}

class myThread5 extends Thread {

    @Override
    public void run() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equals("N")) break;
            else sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
