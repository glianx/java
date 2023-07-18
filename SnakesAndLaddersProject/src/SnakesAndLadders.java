import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SnakesAndLadders {
	public static void main(String [] args) throws InterruptedException, IOException {
		Die d1 = new Die(6);
		Die d2 = new Die(6);
		
		int [][] telepaths = {{54, 19},{0,48},{99,77},
							  {9,34},{40,64},{67,86}};
		
		Player play1 = new Player();
		Player play2 = new Player();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Player 1 name: ");
		play1.setName("Gordon");
//		play1.setName(br.readLine());
		System.out.print("Player 2 name: ");
		play2.setName("Liang");
//		play2.setName(br.readLine());
		System.out.println();
		
		// 10,000 matches
		for (int m = 0; m < 10000; m++) {
			// 100 points per match
			
			play1.setPoints(0);
			play2.setPoints(0);
			
			while (play1.getPoints() < 100 && play2.getPoints() < 100) {
				int p1 = 1;
				int p2 = 1;
				
				// 100 position per round
				while (p1 != 100 && p2 != 100) {
					p1 = turn(p1, d1, d2, telepaths, false);
					p2 = turn(p2, d1, d2, telepaths, true);
					
//					render(p1,p2);
				}
				
				if (p2 == 100) {
//					System.out.println(play1.getName() + " wins!");
					play2.addPoints(10);
				}
				
				else {
//					System.out.println(play2.getName() + " wins!");
					play1.addPoints(10);
				}
				
//				if (p1 == 100) {
////					System.out.println(play1.getName() + " wins!");
//					play1.addPoints(10);
//				}
//				
//				else {
////					System.out.println(play2.getName() + " wins!");
//					play2.addPoints(10);
//				}
				
//				System.out.println("Player 1 points: " + play1.getPoints());
//				System.out.println("Player 2 points: " + play2.getPoints());
//				System.out.println();
			}

			if (play1.getPoints() == 100) {
//				System.out.print(play1.getName());
//				System.out.print(0);
				play1.incMatches();
			}
			else {
//				System.out.print(play2.getName());
//				System.out.print(1);
				play2.incMatches();
			}
		}
		
		System.out.println("PLAYER 1 MATCHES WON: " + play1.getMatches());
		System.out.println("PLAYER 2 MATCHES WON: " + play2.getMatches());
	}
	
	public static int teleport(int p, int [][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] == p) {
//				System.out.println(" T ");
				return a[i][1];
			}
		}
		return p;
	}
	
	public static int turn(int p, Die d1, Die d2, int[][] telepaths, boolean newline) {
		d1.roll();
		d2.roll();
		
		if (p + d1.read() + d2.read() < 101) {
			p = p + d1.read() + d2.read();
		}
		p = teleport(p, telepaths);
		
//		if (!newline) 
//			System.out.print("P1: " + p + "\t" + (d1.read() + d2.read()));
//		else {
//			System.out.println("\tP2: " + p + "\t" + (d1.read() + d2.read()));
//		}
		return p;
	}
	
//	public static void render(int p1, int p2) {
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if (p1 == 
//			}
//		}
//	}
}
