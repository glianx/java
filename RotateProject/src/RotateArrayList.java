import java.util.*;

public class RotateArrayList {
	public static void main(String [] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			a.add(i * i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(a.get(i) + " ");
		}
		int shift = 3;
		rotateMultiple(a, shift);
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(a.get(i) + " ");
		}
		
	}
	
	public static void rotate(ArrayList<Integer> a, int shift) {
		shift = ((shift % a.size()) + a.size()) % a.size();
		for (int s = 0; s < shift; s++) {
			int temp = a.get(a.size() - 1);
			for (int i = a.size() - 1; i > 0; i--) {
				a.set(i, a.get(i-1));
			}
			a.set(0, temp);
		}
	}
	
	public static void rotateMultiple(ArrayList<Integer> a, int shift) {
		shift = ((shift % a.size()) + a.size()) % a.size();
		
		int [] temp = new int[shift];
		for (int i = 0; i < shift; i++) {
			temp[i] = a.get(a.size() - shift + i);
		}
		for (int i = 0; i < a.size() - shift; i++) {
			a.set(a.size() - 1 - i, a.get(a.size() - 1 - i - shift));
		}
		for (int i = 0; i < shift; i++) {
			a.set(i, temp[i]);
		}
	}
}
