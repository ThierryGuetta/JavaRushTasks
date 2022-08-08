package MyTests;

import java.util.Scanner;

public class SecondMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();       //min > secondMin = false; min < secondMin = true; min == secondMin = true;
        int secondMin = scanner.nextInt();
        if (min > secondMin) { // min = 8 > secondMin = 4
            int tmp = min;    // tmp = 8
            min = secondMin;  // min = 4
            secondMin = tmp;  // secondMin = 8
        }
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            } else if (num > secondMin) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);
    }
}