import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPN {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SStack nums = new SStack();
		
		System.out.println("Welcome to RPN calculator. Enter numbers and operators separated by spaces.");
		
		// run until valid input
		boolean valid = false;
		while (!valid) {
			System.out.print("Enter RPN Expression:");
			String [] expr = br.readLine().split(" ");
			try {
				for (int i = 0; i < expr.length; i++) {
					if (
							!expr[i].equals("+") &&
							!expr[i].equals("-") &&
							!expr[i].equals("*") &&
							!expr[i].equals("/")
					) {
						Integer.parseInt(expr[i]);
					}
				}
			}
		}
		
		
		try {
			for (int i = 0; i < expr.length; i++) {
				if (
						!expr[i].equals("+") &&
						!expr[i].equals("-") &&
						!expr[i].equals("*") &&
						!expr[i].equals("/")
					) {
					try {
						nums.push(Integer.parseInt(expr[i]));
					}
					catch (Exception e){
						System.out.println("Invalid input: Please enter number or operator");
					}
				}
				else {
					int r = nums.pop();
					int l = nums.pop();
					
					if (expr[i].equals("+")) {
						nums.push(l + r);
					}
					else if (expr[i].equals("-")) {
						nums.push(l - r);
					}
					else if (expr[i].equals("*")) {
						nums.push(l * r);
					}
					else {
						try {
							nums.push(l / r);	
						}
						catch (Exception e){
							nums.push(l);
							System.out.println("Exception: Division by zero");
						}
					}
				}
			}
			
			int a = nums.pop();
				
			try {
				// > 1 num left in stack
				nums.pop();
				System.out.println("Too few operators");
			}
			
			catch (Exception e) {
				// = 1 num left in stack
				System.out.println(a);
			}
			
		}
		catch (Exception e) {
			// = 0 num left in stack
			System.out.println("Too many operators");
		}
	}
}
