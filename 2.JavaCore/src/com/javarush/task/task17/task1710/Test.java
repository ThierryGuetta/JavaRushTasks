package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date sdf = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH).parse("15/04/1990");
        System.out.println(sdf);
    }
}
