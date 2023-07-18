public class RadixBucketSort {
	
	public int digit(double x, int n) {
		return (int) (x / Math.pow(10, n - 1)) % 10;
	}
	
	public void printArray(int [] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public void printMatrix(int[][] M) {
		for (int row = 0; row < M[0].length; row++) {
			for (int col = 0; col < M.length; col++) {
				System.out.print(M[col][row] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public boolean isSorted(int [] A) {
		boolean sorted = true;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i+1] < A[i]) {
				sorted = false;
			}
		}
		return sorted;
	}

	public int[] Sort(int[] A) {
		
		int len = A.length;
		
		boolean sorted = false;
		int n = 1;
		
		// find max number 
		int maxIndex = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > A[maxIndex]) {
				maxIndex = i;
			}
		}
		int maxNumber = A[maxIndex];
		
		while (!sorted) {

			int[][] M = new int[10][len];
			for (int i = 0; i < len; i++) {
				int col = digit(A[i],n);
				
				if (A[i] == maxNumber && col == 0) {
					sorted = true;
				}
				
				M[digit(A[i],n)][i] = A[i];
			}
			printMatrix(M);
			
			System.out.println("");

			int count = 0;
			int j = 0;
			while (j < 10 && count < 8) {
				int k = 0;
				while (k < len && count < 8) {
					
					if (M[j][k] != 0) {
						A[count] = M[j][k];
						count++;
					}
					
					k++;
				}
				j++;
			}
			
//			sorted = isSorted(A);
			n++;
		}
			
		return A;
		
	}
}
