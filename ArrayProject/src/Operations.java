public class Operations {
	public static void main(String [] args) {
		int [] a = new int[8];
		for (int i = 0; i < 8; i++) {
			a[i] = (i+1) * (i+1);
		}
		insert(a, 3, 99);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		remove(a, 100, 8);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void insert(int [] a, int pos, int val) {
		for (int i = a.length - 1; i > pos; i--) {
			a[i] = a[i-1];
		}
		a[pos] = val;
	}
	
	public static int remove(int [] a, int pos, int size) {
		for (int i = 0; i < a.length - pos - 1; i++) {
			a[pos + i] = a[pos + i + 1];
		}
		a[a.length - 1] = 0;
		return size - 1;
	}
}
