public class Recursion {
	public static void main(String [] args) {
		System.out.println(recurse(1));
	}
	public static int recurse(int x) {
		if (x < 6) {
			return recurse(x + 2) + x;
		}
		else {
			return x - 1;
		}
	}
}
