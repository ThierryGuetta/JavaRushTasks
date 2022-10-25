package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        default Double speed(){
            return 0.0;
        }
    }

    public interface CanFly extends CanMove {

        default Double speed(CanFly canFly) {
            return 0.0;
        }
    }
}