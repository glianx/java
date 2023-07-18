import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Partners2 {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String names1 [] = br.readLine().split(" ");
		String names2 [] = br.readLine().split(" ");
//		System.out.println();
		
//		for (int i = 0; i < n; i++) {
//			System.out.print(names1[i] + " ");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.print(names2[i] + " ");
//		}
//		System.out.println();
		
		// hash array of sums
		int [] hashA = new int[n];
		
		for (int i = 0; i < n; i++) {
			hashA[i] = hash(names1[i],names2[i]);
		}
		
		Arrays.sort(hashA);
		
//		for (int i = 0; i < n; i++) {
//			System.out.print(hashA[i] + " ");
//		}
//		System.out.println();
		
		boolean success = true;
		
		// 0 1 2 3 4 5
		if (n % 2 == 1)	success = false;
		
		for (int i = 0; i < n / 2; i++) {
			if (hashA[2 * i] != hashA[2 * i + 1]) {
				success = false;
			}
		}
		
		if (n == 2 && hashA[0] != hashA[1]) success = false;
		
		if (success) 	System.out.println("good");
		else 			System.out.println("bad");

	}
	
	public static int hash(String name1, String name2) {
//		System.out.println(name1 + " " + name2);
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < name1.length(); i++) {
			sum += (i+2) * (int) name1.charAt(i);
		}
		for (int i = 0; i < name2.length(); i++) {
			sum2 += (i+2) * (int) name2.charAt(i);
		}
		return sum + sum2;
	}
}
