package MyTests;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {-166, -255, 3, 4, 1, 2, 8, 2, 4, 3, 6, 98, 4};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
