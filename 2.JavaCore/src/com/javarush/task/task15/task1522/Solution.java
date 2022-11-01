package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String planet = scanner.nextLine();
        if (planet.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else if (planet.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else if (planet.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else thePlanet = null;
    }
}
