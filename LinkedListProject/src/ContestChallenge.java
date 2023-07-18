import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ContestChallenge {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter String: ");
		
		for (int L = 0; L < 5; L++) {
			String s = br.readLine();
			
//			SStack sstack = new SStack();
			Deque<Integer> sstack = new ArrayDeque<Integer>();
			
			boolean match = true;
			
			try {
				for (int i = 0; i < s.length(); i++) {
	//				System.out.println(s.charAt(i));
					
					if (s.charAt(i) == '[') {
						sstack.push(10);
					}
					else if (s.charAt(i) == '(') {
						sstack.push(20);
					}
					else if (s.charAt(i) == '{') {
						sstack.push(30);
					}
					else if (s.charAt(i) == '<') {
						sstack.push(40);
					}
					
					else if (s.charAt(i) == ']') {
						if (sstack.peek() != 10) {
							match = false;
						}
						else {
							sstack.pop();
						}
					}
					else if (s.charAt(i) == ')') {
						if (sstack.peek() != 20) {
							match = false;
						}
						else {
							sstack.pop();
						}
					}
					else if (s.charAt(i) == '}') {
						if (sstack.peek() != 30) {
							match = false;
						}
						else {
							sstack.pop();
						}
					}
					else if (s.charAt(i) == '>') {
						if (sstack.peek() != 40) {
							match = false;
						}
						else {
							sstack.pop();
						}
					}
//					System.out.print(i + " " ); 
//					sstack.printStack();
				}

				if (match) {
					
					try {
						sstack.pop();
						System.out.println("not balanced");
					}
					catch (Exception e) {
						System.out.println("balanced");
					}
				}
				else {
					System.out.println("not balanced");
				}
			}
			catch (Exception e){
				System.out.println("not balanced");
			}		
		}	
	}
}
