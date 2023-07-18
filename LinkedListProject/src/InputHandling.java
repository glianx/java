import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandling {
//	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	public SStack sstack = new SStack();
	
	public static void main(String [] args) {
		SStack sstack = new SStack();
		
		int i = getInput();
		while (i > 0) {
			sstack.push(i);
			i = getInput();
		}
		
		boolean isEmpty = false;
		while (!isEmpty) {
			try {
				System.out.println(sstack.pop());
			}
			catch (Exception e) {
				System.out.println("Stack is empty");
				isEmpty = true;
			}
		}
		
	}
	
	public static int getInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			try {
				System.out.print("Num: ");
				String s 			= br.readLine();
				int i	 			= Integer.parseInt(s);
				return i;
			} 
			
			catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}
}
