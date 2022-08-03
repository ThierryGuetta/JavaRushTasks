package MyTests;

public class WhileBoxTest2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 20) {
                System.out.print("b");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
