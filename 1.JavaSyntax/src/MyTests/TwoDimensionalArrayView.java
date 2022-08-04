package MyTests;

public class TwoDimensionalArrayView {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {4, 5, 6}, {7}};
        for (int i = 0; i < array.length; i++) {
            int[] array2 = array[i];
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
