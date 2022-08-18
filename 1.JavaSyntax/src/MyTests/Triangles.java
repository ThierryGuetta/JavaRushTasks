package MyTests;

public class Triangles {
    public static void main(String[] args) {
        quaterUpLeft();
        quaterUpRight();
        quaterDownLeft();
        quaterDownRight();
    }

    public static void quaterDownLeft() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void quaterUpLeft() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void quaterDownRight() {
        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void quaterUpRight() {
        for (int i = 0; i < 10; i++) {
            int starCount = 1 + i;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


