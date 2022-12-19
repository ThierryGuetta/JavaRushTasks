package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException{
        if(args.length == 1){
            try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
                String line;
                while((line = br.readLine()) != null){
                    String[] bio = line.split(" ");

                    StringBuilder sb = new StringBuilder();

                    for (String s : bio) {
                        if (!Character.isDigit(s.charAt(0))) sb.append(s).append(" ");
                    }

                    int day = Integer.parseInt(bio[bio.length - 3]);
                    int month = Integer.parseInt(bio[bio.length - 2]);
                    int year = Integer.parseInt(bio[bio.length - 1]);

                    Calendar calendar = new GregorianCalendar(year, month - 1, day);

                    PEOPLE.add(new Person(sb.toString().trim(), calendar.getTime()));
                }
            }
        }
    }
}
