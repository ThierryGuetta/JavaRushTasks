package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
