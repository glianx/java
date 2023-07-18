import java.util.Random;

public class BinaryTree {
	public static void main(String [] args) {
		int r = 3;
		int n = (int) Math.pow(2, r) - 1;
		
		int [] a = new int [n];
		int [] b = new int [(int) Math.pow(2, n) - 1];
		
		Random rand = new Random(); 
		
//		 fill up unordered array A
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(1,50);
		}
		
//		int [] a = {18, 13, 7, 8, 8, 27, 27};
		
		System.out.println();
		
		// fill up ordered array B
		b[0] = a[0];
		for (int i = 1; i < n; i++) {
			int pi = 0;
			while (pi < b.length && b[pi] != 0) {
				if (a[i] <= b[pi]) {
//					System.out.println(a[i] + "<=" + b[pi]);
					pi = 2 * pi + 1;
					
				}
				else {
//					System.out.println(a[i] + ">" + b[pi]);
					pi = 2 * pi + 2;	
				}
			}
			b[pi] = a[i];
		}
		
		// print A
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		// print B
		int i = 0;
		int shown = 0;
		while (shown < n && i < Math.pow(2, n) - 1) {
			System.out.print(b[i] + " ");
			if (b[i] != 0) {
				shown ++;
			}
			i++;
		}
		
		System.out.println();
		
		for (i = 0; i < Math.pow(2, r - 1) - 1; i++) {
			System.out.print(b[i] + " " + b[2*i+1] + " " + b[2*i+2]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// render B in tree form
		i = 0;
		shown = 0;
		int p = 0;
		while (shown < n && i < b.length) {
			
			if (i == Math.pow(2, p)) {
				System.out.println();
				p++;
			}
			System.out.print(b[i] + " ");
			if (b[i] != 0) {
				shown ++;
			}
			i++;
		}
		
		System.out.println();
		inOrderDFS(0, b);
	}
	
	public static void inOrderDFS(int i, int [] a) {
		if (2 * i + 1 < a.length) {
			inOrderDFS(2 * i + 1, a);
		}
		if (a[i] != 0) {
			System.out.print(a[i] + " ");
		}
		if (2 * i + 2 < a.length) {
			inOrderDFS(2 * i + 2, a);			
		}

		
	}
}
