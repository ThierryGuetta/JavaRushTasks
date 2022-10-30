package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!reader.ready()) {
            switch (reader.readLine()) {
                case "user": {
                    doWork(new User());
                    break;
                }
                case "loser": {
                    doWork(new Loser());
                    break;
                }
                case "coder": {
                    doWork(new Coder());
                    break;
                }
                case "proger": {
                    doWork(new Proger());
                    break;
                }
                default:
                    return;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof User) ((User) person).live();
        else if (person instanceof Loser) ((Loser) person).doNothing();
        else if (person instanceof Coder) ((Coder) person).writeCode();
        else if (person instanceof Proger) ((Proger) person).enjoy();
    }
}
