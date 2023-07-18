
public class Board {
	public static void main(String [] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int n = 100 - 10 * i - j;
				System.out.printf("%4d", n);
			}
			System.out.println();
 		}
	}
}
