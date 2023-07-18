import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SnakesAndLadders2 {
	public static void main(String [] args) throws InterruptedException, IOException {
		Die d1 = new Die(6);
		Die d2 = new Die(6);
		
		Player play1 = new Player();
		Player play2 = new Player();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Player 1 name: ");
//		play1.setName("Gordon");
		play1.setName(br.readLine());
		System.out.print("Player 2 name: ");
//		play2.setName("Liang");
		play2.setName(br.readLine());
		System.out.println();
		
		int [] board = new int[100];
		int [][] telepaths = {{54, 19},{90,48},{99,77},
				  			  {9,34},{40,64},{67,86}};
		
		for (int i = 0; i < 100; i++) {
			board[i] = i;
		}
		for (int i = 0; i < telepaths.length; i++) {
			board[telepaths[i][0]-1] = board[telepaths[i][1]-1];
		}
		
//		for (int i = 0; i < board.length; i++) {
//			System.out.println(board[i]);
//		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			play1.setPoints(0);
			play2.setPoints(0);
			
			while (play1.getPoints() < 100 && play2.getPoints() < 100) {
				int p1 = 0;
				int p2 = 0;
				
				// 100 position per round
				while (p1 != 99 && p2 != 99) {
					p1 = turn(p1, d1, d2, board, false);
					p2 = turn(p2, d1, d2, board, true);
					
//					render(p1,p2);
				}
				
				if (p1 == 99) {
					System.out.println(play1.getName() + " wins!");
					play1.addPoints(10);
				}
				
				else {
					System.out.println(play2.getName() + " wins!");
					play2.addPoints(10);
				}
				
				System.out.println("Player 1 points: " + play1.getPoints());
				System.out.println("Player 2 points: " + play2.getPoints());
				System.out.println();
			}
	}
	
	public static int turn(int p, Die d1, Die d2, int[] board, boolean newline) {
		d1.roll();
		d2.roll();
		
		if (p + d1.read() + d2.read() < 100) {
			p = p + d1.read() + d2.read();
		}
		p = board[p];
		
		if (!newline) 
			System.out.print("P1: " + (p + 1) + "\t" + (d1.read() + d2.read()));
		else {
			System.out.println("\tP2: " + (p + 1) + "\t" + (d1.read() + d2.read()));
		}
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
