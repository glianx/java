import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Jerseys {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int J = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		
		int [] sizes = new int[J];
		for (int i = 0; i < J; i++) {
			String s = br.readLine();
			char size = s.charAt(0);
			if (size == 'S') 		sizes[i] = 10;
			else if (size == 'M')	sizes[i] = 20;
			else 					sizes[i] = 30;
		}
		
		int [] sizerequests = new int[A];
		int [] numrequests = new int[A];
		
		for (int i = 0; i < A; i++) {
			String [] s = br.readLine().split(" ");
			char size = s[0].charAt(0);
			if (size == 'S') 		sizerequests[i] = 10;
			else if (size == 'M')	sizerequests[i] = 20;
			else 					sizerequests[i] = 30;
			
			int num = Integer.parseInt(s[1]);
			numrequests[i] = num;
		}
		
//		for (int i = 0; i < sizes.length; i++) {
//			System.out.print(sizes[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < sizerequests.length; i++) {
//			System.out.print(sizerequests[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < numrequests.length; i++) {
//			System.out.print(numrequests[i] + " ");
//		}
//		System.out.println();
		
		int match = 0; 
		for (int i = 0; i < A; i++) {
			if (sizes[numrequests[i]-1] >= sizerequests[i]) {
//				System.out.println(i + " " + numrequests[i] + " " + sizes[numrequests[i]] + " " + sizerequests[i]);
				match ++;
				sizes[numrequests[i]-1] = -10;
			}
		}
		
		System.out.println(match);
	}
}
