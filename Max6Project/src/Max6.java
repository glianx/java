import java.util.Random;

public class Max6 {
	public static void main(String [] args) {
		int [] A = new int[100];
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++) {
			A[i] = rand.nextInt(100000);
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.print(A[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.println(findMax6(A));
	}
	
	public static double findMax6(int [] A) {
		int [] maxArray = new int[6];
		for (int i = 0; i < 6; i++) {
			maxArray[i] = A[i];
		}
		int min = MinIndex(maxArray);
		for (int i = 6; i < 100; i++) {
			if (A[i] > maxArray[min]) {
				maxArray[min] = A[i];
				min = MinIndex(maxArray);
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(maxArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		return Sum(maxArray) / 6;
	}
	
	private static int MinIndex(int [] B) {
		int min = 0;
		for (int i = 0; i < 6; i++) {
			if (B[i] < B[min]) {
				min = i;
			}
		}
		return min;
	}
	
	private static int Sum(int [] C) {
		int tot = 0;
		for (int i = 0; i < 6; i++) {
			tot = tot + C[i];
		}
		return tot;
	}
}
