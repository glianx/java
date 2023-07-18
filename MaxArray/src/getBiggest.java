public class getBiggest {
	public static int g(int [] a) {
		int n = a.length;
		
		if (a[0] >= a[(n-1)/2] &&
			a[0] >= a[n-1]) {
			return a[0];
		}
		else if (a[(n-1)/2] >= a[n-1]) {
			return a[(n-1)/2];
		}
		else {
			return a[n-1];
		}
	}
	
	public static int c(int [] a) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum += a[i];
			}
			else {
				oddSum += a[i];
			}
		}
		
		if (evenSum <= oddSum) {
			return evenSum;
		}
		else
			return oddSum;
		
	}
	
	public static void main(String [] args) {
		int [] a = {3,1,6};
		System.out.println(g(a));
		System.out.println(c(a));
	}
}
