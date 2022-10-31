package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker latteMaker = new LatteMaker();
        latteMaker.makeDrink();
        TeaMaker teaMaker = new TeaMaker();
        teaMaker.makeDrink();
    }
}
