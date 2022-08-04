package MyTests;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                array[i][j] = i * j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}