package MyTests;

public class LessonArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i] = new int[5];
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
