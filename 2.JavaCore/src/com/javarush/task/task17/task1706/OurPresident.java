package com.javarush.task.task17.task1706;

public class OurPresident { //решение принято

    static {
        Object obj = new Object();
        synchronized (obj) {
            president = new OurPresident();
        }
    }

    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}