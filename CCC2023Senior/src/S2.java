import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] heights = new int[N];
		String [] stringheights = br.readLine().split(" ");
		
		for (int i = 0; i < N; i++) {
			heights[i] = Integer.parseInt(stringheights[i]);
		}
		
		// lookup table for asymmetry values
		int [] asymmetry_lookup = new int[2 * N];
		
		// iterate over range i
		System.out.print("0 ");
		for (int i = 2; i < N + 1; i++) { // length from 2 to N
			int min_assymetry = 500000000;

			for (int j = 0; j < N - i + 1; j++) { // starting index 
//				int curr_assymetry = assymetry(heights, j, j+i-1, min_assymetry);
				
				int j1 = j;
				int j2 = j + i - 1;
				asymmetry_lookup[j1 + j2] = asymmetry_lookup[j1 + j2] + Math.abs(heights[j2]-heights[j1]);
				int curr_assymetry = asymmetry_lookup[j1 + j2];
				if (curr_assymetry < min_assymetry) {
					min_assymetry = curr_assymetry;
				}
			}
			System.out.print(min_assymetry + " ");
		}
	}
	
//	public static int assymetry(int [] h, int j1, int j2, int min_assymmetry) {
//		int assymetry_sum = 0;
//		for (int 
//				i = 0; 
//				i < Math.ceil((j2 - j1) / 2) + 1
//				&& assymetry_sum < min_assymmetry; 
//				i++) {
//			assymetry_sum += Math.abs(h[j1 + i] - h[j2 - i]);
//		}
//		return assymetry_sum;
//		return asymmetry_lookup[j1 + j2] + Math.abs(h[j2]-h[j1]);
//	}
}
