import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		int R = Integer.parseInt(s[2]);
		int C = Integer.parseInt(s[3]);
		
		if (R == 2 && C == 2) {
			String row1 = "";
			for (int i = 0; i < M; i++) {
				row1 += "a";
			}
			System.out.println(row1);
			
			String row2 = "a";
			for (int j = 0; j < M - 1; j++) {
				row2 += "b";
			}
			
			for (int i = 0; i < N - 1; i++) {
				System.out.println(row2);
			}
		}
		
		else if (N <= 2 && M <= 2){
			if (R == 0 && C == 0) {
				System.out.println("ab");
				System.out.println("cd");
			}
			else if (R == 0 && C == 1) {
				System.out.println("ab");
				System.out.println("ad");
			}
			else if (R == 1 && C == 0) {
				System.out.println("aa");
				System.out.println("cd");
			}
			else if (R == 1 && C == 1) {
				System.out.println("aa");
				System.out.println("ab");
			}
			else if (R == 0 && C == 2) {
				System.out.println("cd");
				System.out.println("cd");
			}
			else if (R == 2 && C == 0) {
				System.out.println("aa");
				System.out.println("bb");
			}
			else if (R + C == 3) {
				System.out.println("IMPOSSIBLE");
			}
			else {
				System.out.println("aa");
				System.out.println("aa");
			}
 		}
		else {
			if (N == 0) {
				for (int r = 0; r < 2; r++) {
					for (int i = 0; i < M; i++) {
						if (i <= C) {
		 					if (i % 3 == 0) {
								System.out.print("a");
							}
							if (i % 3 == 1) {
								System.out.print("b");
							}
							if (i % 3 == 2) {
								System.out.print("c");
							}
						}
						System.out.println("d ");
					}
					System.out.println();
				}
				
			}
			else if (N == 1) {
				for (int i = 0; i < M; i++) {
	 				System.out.print("a");
				}
				System.out.println();
				for (int i = 0; i < M; i++) {
					if (i <= C) {
						System.out.println("a");
					}
					else {
						System.out.print("b");
					}
				}
			}
		}
	}
}
