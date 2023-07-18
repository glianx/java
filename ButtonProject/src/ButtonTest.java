import java.lang.Math;

public class ButtonTest {
	public static void main(String [] args) {
		
		Button [] btns = new Button[8];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button();
		}
		
		btns[0].push();
		btns[1].push();
		btns[2].push();
		btns[5].push();
		btns[6].push();
		
		printByte(btns);
		printDec(btns);
		
		btns[1].push();
		btns[2].push();
		btns[5].push();
		
		printByte(btns);
		printDec(btns);
		
		btns[7].push();
		btns[0].push();
		
		printByte(btns);
		printDec(btns);
		
		Button [] btns2 = new Button[8];
		for (int i = 0; i < btns.length; i++) {
			btns2[i] = new Button();
		}
		decToBin(42, btns2);
		
		printByte(btns2);
		printDec(btns2);
		
		binToBin(btns, btns2);
		
		printByte(btns);
		printDec(btns);
	}
	
	private static void printByte(Button [] btns) {
		for (int i = 7; i > -1; i--) {
			System.out.print(btns[i].getState() ? 1 : 0);
		}
		System.out.println();
	}
	
	private static void printDec(Button [] btns) {
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			if (btns[i].getState()) {
				sum += (int) Math.pow(2,i);
			}
		}
		System.out.println(sum);
		System.out.println();
	}

	private static int getDec(Button [] btns) {
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			if (btns[i].getState()) {
				sum += (int) Math.pow(2,i);
			}
		}
		return sum;
	}
	
	private static void decToBin(int dec, Button [] btns2) {
		for (int i = 0; i < 8; i++) {
			if (dec % 2 == 1) {
				btns2[i].push();
				dec -= 1;
			}
			dec /= 2;
		}
	}
	
	private static void binToBin(Button [] btns, Button [] btns2) {
		int oldDec = getDec(btns);
		int newDec = getDec(btns2);
		int difference;
		if (newDec > oldDec) { 
			difference = newDec - oldDec;
		}
		else {
			difference = oldDec - newDec;
		}
		
		Button [] btns3 = new Button[8];
		
		for (int i = 0; i < btns.length; i++) {
			btns3[i] = new Button();
		}
		
		decToBin(difference, btns3);
		
		for (int i = 0; i < 8; i++) {
			if (btns3.getState()) {
				
			}
		}
		
		
	}
	
	private static void binAdd(Button [] btns, Button [] btns2) {
		Button [] btnSum = new Button[8];
		
		for (int i = 0; i < btns.length; i++) {
			btnSum[i] = new Button();
		}
		
		boolean carryover = false;
		for (int i = 0; i < 8; i++) {
			if (btns[i].getState()  btns2[i].getState()) {
				btnSum[i].push();
			}
			carryover = btns[i].getState() && btns2[i].getState();
					
		}
	}
	
//	private static void binToBin(Button [] btns, Button [] btns2) {
//		for (int i = 0; i < 8; i++) {
//			if (btns[i].getState() != btns2[i].getState()) {
//				btns[i].push();
//			}
//		}
//	}
}