package MyTests;

public class DoubleTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
                if (j == 18 - i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
