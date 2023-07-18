public class Array2D {
	public static void main(String [] args) {
		int n = 4;
		int m = 7;
//		timesTable(n,m);
		calendar(n, m);
	}
	
	public static void calendar(int n, int m) {
		int [][] cal = new int[n][m];
		// initialize
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				cal[row][col] = row * m + col + 1;
			}
		}
		// row wise
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				String pad = " ";
				for (int i = 0; i < Integer.toString(n*m).length()
								  - Integer.toString(cal[row][col]).length(); i++) {
					pad += " ";
				}
				System.out.print(cal[row][col] + pad);					
			}
			System.out.println();
		}
		System.out.println();
//		// col wise
//		for (int col = 0; col < m; col++) {
//			for (int row = 0; row < n; row++) {
//				String pad = " ";
//				for (int i = 0; i < Integer.toString(n*m).length()
//								  - Integer.toString(cal[row][col]).length(); i++) {
//					pad += " ";
//				}
//				System.out.print(cal[row][col] + pad);					
//			}
//			System.out.println();
//		}
//		System.out.println();
//		// transpose
//		int [][] caltrans = new int[m][n];
//		for (int row = 0; row < n; row++) {
//			for (int col = 0; col < m; col++) {
//				caltrans[col][row] = cal[row][col];
//			}
//		}
//		// row wise
//		for (int row = 0; row < m; row++) {
//			for (int col = 0; col < n; col++) {
//				String pad = " ";
//				for (int i = 0; i < Integer.toString(n*m).length()
//								  - Integer.toString(caltrans[row][col]).length(); i++) {
//					pad += " ";
//				}
//				System.out.print(caltrans[row][col] + pad);					
//			}
//			System.out.println();
//		}
		System.out.println();
		// diagonal!
		for (int sum = 0; sum < m + n; sum++) {
			for (int i = 0; i < sum + 1; i++) {
				if (i < n && sum - i < m) {
						System.out.println(cal[i][sum - i]);
				} 
			}
		}
		// spiral
		int [] dir = new int[2];
		dir[0] = 1;
		dir[1] = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < n * m; i++) {
			System.out.println(cal[row][col]);
			if (row == n - 1) {
				
			}
			row += dir[0];
			col += dir[1];
		}

	}
	
	public static void timesTable(int n, int m) {
		int [][] grid = new int[n][m];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				grid[row][col] = (row + 1) * (col + 1);
			}
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				String pad = " ";
				for (int i = 0; i < Integer.toString(n * m).length()
								   -Integer.toString(grid[row][col]).length(); i++) {
					pad = pad + " ";
				}
				System.out.print(grid[row][col] + pad);
			}
			System.out.println();
		}
	}
}
