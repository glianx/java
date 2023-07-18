import java.util.*;
import java.io.*;

public class GenevaConfection {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int T = Integer.parseInt(br.readLine());
//		
//		for (int t = 0; t < T; t++) {
			ArrayList <Integer> s = new ArrayList<Integer>();
			ArrayList <Integer> l = new ArrayList<Integer>();
			s.add(100000);
			l.add(0);
			
			int n = Integer.parseInt(br.readLine());
			int [] a = new int [n];
			for (int i = 0; i < n; i++) {
				a[n - 1 - i] = (Integer.parseInt(br.readLine()));
			}
			
			char status = 'Y';
			for (int i = 0; i < n; i++) {
				
				showList(a,n);
				System.out.print("        ");
				showArrayList(s);
				showArrayList(l);
							
				if (a[i] != l.get(l.size() - 1) + 1 && a[i] > s.get(s.size() - 1)) {
//						System.out.println("Fail");
						status = 'N';
					}
				else if (a[i] == l.get(l.size() - 1) + 1) {
					l.add(a[i]);
					a[i] = 0;
				}
				else {
					s.add(a[i]);
					a[i] = 0;
				}
			}
			System.out.println(status);
		}
//	}
	
	public static void showList(int [] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void showArrayList(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}
}
