import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AveragePseudo {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] NUMS = new int[10];
		
		String [] s = br.readLine().split(" ");
		for (int i = 0; i < 10; i++) {
			NUMS[i] = Integer.parseInt(s[i]);
		}
		
		int EVEN_SUM = 0;
		int EVEN_COUNT = 0;
		int ODD_SUM = 0;
		
		for (int i = 0; i < 10; i++) {
			if (NUMS[i] % 2 == 0) {
				EVEN_SUM += NUMS[i];
				EVEN_COUNT ++;
			}
			else {
				ODD_SUM += NUMS[i];
			}
		}

		try {
			System.out.println("even average " + (float) EVEN_SUM / EVEN_COUNT);
			System.out.println("even sum " + EVEN_SUM);
			System.out.println("even count " + EVEN_COUNT);
		}
		catch (Exception e) {}
		try {
			System.out.println("odd average " + (float) ODD_SUM / (10 - EVEN_COUNT));
			System.out.println("odd sum " + ODD_SUM);
			System.out.println("odd count " + (10 - EVEN_COUNT));
		}
		catch (Exception e) {}
	}
}
