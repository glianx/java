import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		int [] row1 = new int[C];
		int [] row2 = new int[C];
		String [] row1s = br.readLine().split(" ");
		String [] row2s = br.readLine().split(" ");
		
		for (int i = 0; i < C; i++) {
			row1[i] = Integer.parseInt(row1s[i]);
			row2[i] = Integer.parseInt(row2s[i]);
		}
		
		int length = 0;
		
		if (row1[0] == 1) {
			length += 3;
		}
		
		for (int i = 1; i < C; i++) {
			if (row1[i] == 1) {
				if (row1[i-1] == 1) {
					length += 1;
				}
				else {
					length += 3;
				}
			}
		}
		
		if (row2[0] == 1) {
//			System.out.println("first");
			if (row1[0] == 0) {
				length += 3;
			}
			else {
				length += 1;
			}
		}
		
		for (int i = 1; i < C; i++) {
//			System.out.println("second");
			if (row2[i] == 1) {
				if (row2[i-1] == 0) {
					if (i % 2 == 1 || row1[i] == 0) {
						length += 3;
					}
					else {
						length += 1;
					}		
				}
				else {
					if (i % 2 == 1 || row1[i] == 0) {
						length += 1;
					}
					else {
						length --;
					}
				}
			}
		}
		System.out.println(length);
	}
}
