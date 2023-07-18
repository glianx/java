public class DoubleRecursion {
	public static void main(String [] args) {
		System.out.println(doubleRecurse(17));
	}
	public static int doubleRecurse(int x) {
//		System.out.println(x);
		if (x <= 5) {
			return 2 * x - 1;
		}
		else {
			return doubleRecurse(x - 3) - doubleRecurse(x - 1);
		}
	}
}
