import java.util.Arrays;

public class RadixSort {

    public static void sort(int[] array) {
        // Find the maximum number in the array to determine the number of digits
        int max = Arrays.stream(array).max().getAsInt();

        // Perform counting sort on each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp);
        }
    }

    private static void countSort(int[] array, int exp) {
        int[] count = new int[10];
        int[] output = new int[array.length];

        // Count the frequency of each digit
        for (int i = 0; i < array.length; i++) {
            count[(array[i] / exp) % 10]++;
        }

        // Calculate the prefix sum of the count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy the output array back to the original array
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] array = { 170, 45, 75, 90, 802, 24, 2, 66 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
