package MyTests;

public class WhileBoxTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 20) {
                if (i == 0 || i == 9) {
                    System.out.print("b");
                } else if (j == 0 || j == 19) {
                    System.out.print("b");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}