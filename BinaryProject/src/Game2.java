import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game2 {
	public double decAndBin(String mode, double p) throws IOException {
		System.out.println(mode + "\n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// random decimal number 0 - 255
		Random rand = new Random();
		int d = rand.nextInt(32);
		
		// print decimal for conversion
		if (mode == "decToBin") {
			System.out.println(d);
		}
		// print byte for conversion
		else if (mode == "binToDec") {
			Byte b = new Byte(d);
			System.out.println(b.getByteRev());
		}
		
		double totalPoints = p;
		
		boolean solved  = false;
		int numAttempts = 1;
		
		while (!solved) {
			// user input in byte string
			if (mode == "decToBin") {
				String s = br.readLine().replaceAll("\\s","");
				// byte string length 8
				while (s.length() != 8) {
					System.out.println("Error: enter byte");
					s = br.readLine();
				}
				// reverse byte string order
				String s2 = "";
				for (int i = 0; i < 8; i++) {
					s2 = s2 + s.charAt(7 - i);
				}
				// initialize Byte with byte string
				Byte b = new Byte(s2);
				
				// check if decimal matches byte
				solved = ( d == b.getByteD() );
				statusUpdate(solved, numAttempts);
				if (solved) {
					totalPoints += 100 * Math.pow(0.5, numAttempts - 1);
				} 
				else {
					numAttempts += 1;
				}
			}
			else if (mode == "binToDec") {
				// user input in decimal
				int inputDec = Integer.parseInt(br.readLine());
				
				solved = ( inputDec == d );
				statusUpdate(solved, numAttempts);
				// check if input equals random decimal
				if (solved) {
					totalPoints += 100 * Math.pow(0.5, numAttempts - 1);
				} 
				else {
					Byte fail = new Byte(inputDec);
					System.out.println(fail.getByteRev());				
					numAttempts += 1;
				}
			}
		}
		System.out.println("Your points: " + totalPoints + "\n");
		
		return totalPoints;

	}
	
	public boolean statusUpdate(boolean success, int numAttempts) {
		if (success) {
			System.out.println("Success");
			System.out.println("You took " + numAttempts + " tries");
			return true;
		} 
		else {
			System.out.println("Fail");
			return false;
		}
	}
}
