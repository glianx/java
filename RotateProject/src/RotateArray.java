public class RotateArray {
	public static void main(String [] args) {
		int n = 10;
		int [] a = new int [n];
		for (int i = 0; i < n-3; i++) {
			a[i] = i * i;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		int rot = 2;
		rotateMultiple(a, rot, n);
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void rotate(int [] a, int rot, int n) {
		rot = ((rot % n) + n) % n;
		for (int i = 0; i < rot; i++) {
			int temp = a[n-1];
			for (int j = 0; j < n - 1; j++) {
				a[n - j - 1] = a[n - j - 2];
			}
			a[0] = temp;
		}
	}
	
	public static void rotateMultiple(int [] a, int rot, int n) {
		rot = ((rot % n) + n) % n;
		int [] temp = new int[rot];
		for (int i = 0; i < rot; i++) {
			temp[i] = a[n - rot + i];
		}
		for (int i = 0; i < n - rot; i++) {
			a[n - i - 1] = a[n - i - 1 - rot];
		}
		for (int i = 0; i < rot; i++) {
			a[i] = temp[i];
		}
	}
}
