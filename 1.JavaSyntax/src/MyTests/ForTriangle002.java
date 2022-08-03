package MyTests;

public class ForTriangle002 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            int stringCount = 40 - i;
            for (int j = 40; j > stringCount; j--) {
                System.out.print("b");
            }
            System.out.println();
        }
    }
}
