package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
