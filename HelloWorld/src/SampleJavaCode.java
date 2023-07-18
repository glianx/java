import java.util.Scanner;
import java.io.*;

public class SampleJavaCode {
	public static void main (String [] args) throws Exception {
//		Scanner inData = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int number;
		int value;
		float price;
		int result1;
		float result2;
		String userName;
		
//		int i;
		int [] numbers = new int[10];
		
//		System.out.print("Hello World!\n");
//		number = 44;
//		System.out.println();
//		System.out.println("\n" + number);
//		price= (float) 4.99;
//		System.out.println(price);
//		value = 5;
//		result1 = number / value;
//		result2 = number / value;
//		
//		System.out.println(result1);
//		System.out.println(result2);
		
//		number = inData.nextInt();
//		System.out.println(number);
		
//		value = inData.nextInt();
//		System.out.println(number * value);
		
//		inData.close();
		
//		userName = br.readLine();
//		System.out.println("Hello " + userName + ",\nHow are you today?");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		
		for (int i = numbers.length - 1; i > -1; i--) {
			System.out.println(numbers[i]);
		}
	}
}