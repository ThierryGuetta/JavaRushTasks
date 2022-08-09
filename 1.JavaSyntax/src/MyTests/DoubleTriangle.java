package MyTests;

public class DoubleTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 22; i++) {
            if (i > 10) {
                continue;
            }
            for (int j = 0; j < 22 - i; j++) {
                System.out.print("*");
                if (j == 10 - i) System.out.print(" ");
                else if (j > 10) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
