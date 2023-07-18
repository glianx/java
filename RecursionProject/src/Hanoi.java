import java.util.ArrayList;

public class Hanoi {
	public static void main(String [] args) {
		int n = 3;
		ArrayList <Integer> a = new ArrayList<Integer>();
		ArrayList <Integer> b = new ArrayList<Integer>();
		ArrayList <Integer> c = new ArrayList<Integer>();
		hanoi(a,b,c, n);
	}
	public static void hanoi(
			ArrayList <Integer> a,
			ArrayList <Integer> b,
			ArrayList <Integer> c,
			int n
	) {
		if (n == 1) {
			a.remove(a.size() - 1);
			c.add(1);
		}
		else {
			hanoi(a,c,b,n-1);
		}
	}
}
