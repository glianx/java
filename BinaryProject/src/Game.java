import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Decimal to Binary
		
		// random decimal number 0 - 255
		Random rand = new Random();
		int d = rand.nextInt(64); 
		System.out.println(d);
		
		double totalPoints = 0;
		
		boolean solved  = false;
		int numAttempts = 1;
		
		while (!solved) {
			// user input in byte string
			String s = br.readLine().replaceAll("\\s","");
			while (s.length() != 8) {
				System.out.println("Error: enter byte");
				s = br.readLine();
			}
//		System.out.println(s);
			
			// reverse byte string order
			String s2 = "";
			for (int i = 0; i < 8; i++) {
				s2 = s2 + s.charAt(7 - i);
			}
//		System.out.println(s2);
			
			// initialize Byte with byte string
			Byte b = new Byte(s2);
			
			if (d == b.getByteD()) {
				System.out.println("Success");
				System.out.println("You took " + numAttempts + " tries");
				totalPoints += 100 * Math.pow(0.5, numAttempts - 1);
				solved = true;
			} 
			else {
				System.out.println("Fail - " + b.getByteD());
				
//				Byte ans = new Byte(d);
//				System.out.println("Real answer: " + ans.getByte());
				
				numAttempts += 1;
			}
			
		}
		System.out.println("Your points: " + totalPoints);
		
		
		
		
		
		
//		 Binary to Decimal
		
		// random decimal number 0 - 255
		int d2 = rand.nextInt(64); 
		Byte b2 = new Byte(d2);

		// reverse byte string order
		String b3 = "";
		for (int i = 0; i < 8; i++) {
			b3 = b3 + b2.getByte().charAt(7 - i);
		}
		System.out.println(b3);
		
		boolean solved2  = false;
		int numAttempts2 = 1;
		
		while (!solved2) {
			// user input in decimal
			int inputDec = Integer.parseInt(br.readLine());
			
			if (inputDec == b2.getByteD()) {
				System.out.println("Success");
				System.out.println("You took " + numAttempts2 + " tries");
				totalPoints += 100 * Math.pow(0.5, numAttempts2 - 1);
				solved2 = true;
			} 
			else {
				Byte fail = new Byte(inputDec);
				System.out.println(fail.getByteRev() + " - Fail");
				
	//			Byte ans = new Byte(d);
	//			System.out.println("Real answer: " + ans.getByte());
				
				numAttempts2 += 1;
			}
			
		}
		System.out.println("Your points: " + totalPoints);
		
		
	}
}
