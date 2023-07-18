import java.util.Arrays;

public class RadixSortTest {

    public static void main(String[] args) {
        int[] array = { 2022, 2021, 20221, 20222, 101, 1, 0, 1, 10, 100, 77 };

        RadixSort.sort(array);

        for (int i = 0; i < array.length; i++) {
        	System.out.println(array[i]);
        }
    }
}
