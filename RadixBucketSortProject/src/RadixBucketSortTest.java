import java.util.Random;

public class RadixBucketSortTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int p = 5;
		
		RadixBucketSort r = new RadixBucketSort();
		int[] a = new int[8];
		for (int i = 0; i < 8; i++) {
			a[i] = rand.nextInt((int) Math.pow(10, p));
		}
		
		int[] sortedA = r.Sort(a);
		r.printArray(sortedA);
	}
}