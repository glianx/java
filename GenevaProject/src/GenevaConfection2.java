import java.util.*;
import java.io.*;

public class GenevaConfection2 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			
			int n = Integer.parseInt(br.readLine());
			int [] a = new int [n];
			
			ArrayList <Integer> b = new ArrayList<Integer>();
			ArrayList <Integer> l = new ArrayList<Integer>();
//			b.add(100000);
//			l.add(0);
			
			for (int i = 0; i < n; i++) {
				a[n - 1 - i] = (Integer.parseInt(br.readLine()));
			}
			
			char status = 'Y';
			for (int i = 0; i < n; i++) {	
				
				if (l.size() == 0) {
					if (a[i] == 1) {
						l.add(a[i]);
					}
					else {
						b.add(a[i]);
					}
				}
				else if (a[i] == l.get(l.size() - 1) + 1) {
					l.add(a[i]);
				}
				else if (b.size() == 0
						  || a[i] <= b.get(b.size() - 1)
				) {
					b.add(a[i]);
				}
				else if (b.get(b.size() - 1) == l.get(l.size() - 1) + 1) {
					l.add(b.get(b.size() - 1));
					b.remove(b.size() - 1);
				}
				else {
					status = 'N';
				}
				
				showList(a,n);
				showArrayList(b);
				showArrayList(l);
				System.out.println();
			}
			System.out.println(status);
		}
	}
	
	public static void showList(int [] a, int n) {
		System.out.print("a: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void showArrayList(ArrayList<Integer> a) {
		System.out.print(a.size() + ": ");
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}
}
