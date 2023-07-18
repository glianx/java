import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexValue {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String h = br.readLine();
		String b = br.readLine();
		System.out.println(hexToDec(h));
		System.out.println(binToDec(b));
	}
	
	public static int hexToDec(String s) {
		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			value = value * 16 + hexValue(s.charAt(i));
		}
		return value;
	}
	
	public static int binToDec(String s) {
		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			value = value * 2 + binValue(s.charAt(i));
		}
		return value;
	}
	
	public static int hexValue(char c) {
		int a = (int) c;
		if (65 <= a && a <= 70) {
			return a - 55;
		}
		else if (97 <= a && a <= 102) {
			return a - 87;
		}
		else if (48 <= a && a <= 57) {
			return a - 48;
		}
		return -1;
	}
	
	public static int binValue(char c) {
		int a = (int) c;
		if (48 <= a && a <= 49) {
			return a - 48;
		}
		return -1;
	}
}
