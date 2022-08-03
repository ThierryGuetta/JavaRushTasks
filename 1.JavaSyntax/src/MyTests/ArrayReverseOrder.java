package MyTests;

import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }
    }
}
