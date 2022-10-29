package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution implements Country {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (country.equals(UKRAINE)) return new UkrainianHen();
            else if (country.equals(RUSSIA)) return new RussianHen();
            else if (country.equals(MOLDOVA)) return new MoldovanHen();
            else if (country.equals(BELARUS)) return new BelarusianHen();
            else return null;
        }
    }
}
