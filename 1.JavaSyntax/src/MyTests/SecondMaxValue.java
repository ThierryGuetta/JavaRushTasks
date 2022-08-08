package MyTests;

import java.util.Scanner;

public class SecondMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int secondMax = scanner.nextInt();
        int tmp = max;
        if (secondMax > max) {
            max = secondMax;
            secondMax = tmp;
        }
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > secondMax && num < max) {
                secondMax = num;
            } else if (num > max) {
                secondMax = max;
                max = num;
            } else if (max == secondMax && num < secondMax) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}
