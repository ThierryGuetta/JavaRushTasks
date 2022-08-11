package MyTests;

import java.util.Scanner;

public class MethodCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        bio(name, age);
        System.out.print(name + " ");
        ageJobCheck(age);
    }

    public static void bio(String name, int age) {
        System.out.println("Your bio: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void ageJobCheck(int age) {
        if (age >= 18) System.out.println("can be a programmer!");
        else System.out.println("can't be a programmer!");
    }
}
