package MyTests;

public class ReverseTriangleArray {
    public static void main(String[] args) {
        int[][] array = new int[9][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[array.length - i];
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = i * j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}