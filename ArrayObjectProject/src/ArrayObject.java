import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayObject {
	public static void main(String [] args) throws IOException {
		// invoke constructor method ()
		ArrayList <String> colours = new ArrayList<String>();
		
		colours.add("purple");
		colours.add("green");
		colours.add("red");
		colours.set(1, "yellow");
		colours.add("vantablack");
		colours.add("black");
		colours.add("amaranth");		

		// Collections.reverseOrder returns comparator object
		Collections.sort(colours, Collections.reverseOrder());
		
		printList(colours);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String colour1 = br.readLine();
		String colour2 = br.readLine();
		
		exchange(colours, colour1, colour2);
		
		printList(colours);
		
	}
	
	public static void printList(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	public static void exchange(ArrayList<String> a, String e1, String e2) {		
		int i = getLocation(a, e1);
		
		if (i != -1) {
			a.set(i, e2);
		}
		else {
			System.out.println("Element is not in list");
		}
	}
	
	public static int getLocation(ArrayList<String> a, String e) {
		int i = 0;
//		while (i < a.size() && !a.get(i).equals(e)) {
//			i++;
//		}
		for (;i < a.size() && !a.get(i).equals(e);i++);
		if (i == a.size()) {
			return -1;
		}
		return i;
	}
}