package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] string = fileScanner.nextLine().split(" ");
            String imya = string[1];
            String familiya = string[0];
            String otchestvo = string[2];
            Calendar calendar = new GregorianCalendar
                    (Integer.parseInt(string[5]), Integer.parseInt(string[4]) - 1, Integer.parseInt(string[3]));
            Date birthdate = calendar.getTime();
            Person person = new Person(imya, otchestvo, familiya, birthdate);

            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
