package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args[0].equals("-c") && args.length == 4) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1],
                        new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                System.out.println(allPeople.size() - 1);
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1],
                        new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                System.out.println(allPeople.size() - 1);
            }
        }
        if (args[0].equals("-r") && args.length == 2) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = (person.getSex() == Sex.MALE) ? "м" : "ж";
            System.out.println(person.getName() + " " + sex + " " +
                    new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate()));
        }
        if (args[0].equals("-u") && args.length == 5) {
            if (args[3].equals("м")) {
                allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2],
                        new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));
            }
            if (args[3].equals("ж")) {
                allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2],
                        new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));
            }
        }
        if (args[0].equals("-d") && args.length == 2) {
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
        }
    }
}