import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Partners {
	public static void main(String [] args) throws IOException {
//		int hash1 = 0;
//		int hash2 = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s1 [] = br.readLine().split(" ");
		String s2 [] = br.readLine().split(" ");
		System.out.println();
		
		// hash array of sums
		int [] hashA = new int[n];
		
//		for (int i = 0; i < s1.length; i++) {
//			hash1 = hash1 * hash(s1[i],s2[i]) % 1000;
//			hash2 = hash2 * hash(s2[i],s1[i]) % 1000;
//		}
//		System.out.println(hash1 + " " + hash2);
//		System.out.println(hash1 == hash2 ? "good" : "bad");
	}
	
	public static int hash(String name1, String name2) {
		System.out.println(name1 + " " + name2);
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < name1.length(); i++) {
			sum += (int) name1.charAt(i);
//			System.out.println((int) name1.charAt(i) + " " + name1.charAt(i) + " " + sum);
		}
		for (int i = 0; i < name2.length(); i++) {
			sum2 += (int) name2.charAt(i);
//			System.out.println((int) name2.charAt(i) + " " + name2.charAt(i) + " " + sum);
		}
//		System.out.println(sum * sum2);
		return sum + 2 * sum2;
	}
}
