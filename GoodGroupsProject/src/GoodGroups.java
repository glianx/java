import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GoodGroups {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int [] same = new int[X];
		
		for (int i = 0; i < X; i++) {
			String [] names = br.readLine().split(" ");		
			same[i] = Integer.parseInt(names[0]) * Integer.parseInt(names[1]);
		}
		
		
		int Y = Integer.parseInt(br.readLine());
		int [] diff = new int[X];
		
		for (int i = 0; i < Y; i++) {
			String [] names = br.readLine().split(" ");		
			diff[i] = Integer.parseInt(names[0]) * Integer.parseInt(names[1]);
		}
		
		
		int G = Integer.parseInt(br.readLine());
		int [] groups = new int[X];
		
		for (int i = 0; i < Y; i++) {
			String [] names = br.readLine().split(" ");		
			groups[i] = Integer.parseInt(names[0]) 
					* Integer.parseInt(names[1]) 
					* Integer.parseInt(names[2]);
		}
		
		int num = 0;
		for (int i = 0; i < )
	}
}
