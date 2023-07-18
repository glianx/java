import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabblingBrooks {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] a = new double[100];
		
		for (int i = 0; i < n; i++) {
			a[i] = Double.parseDouble(br.readLine());
		}
		
		boolean inputEnded = false;
		while (!inputEnded) {
//			System.out.println("Type: ");
			int typeInt = Integer.parseInt(br.readLine());
			
			if (typeInt == 77) {
				inputEnded = true;
				for (int i = 0; i < a.length; i++) {
					if (a[i] != 0) {
						System.out.print(Math.round(a[i]) + " ");
					}
				}
			}
			else {
				
				if (typeInt == 99) {
//					System.out.println("Split!");
					
					int splitIndex = Integer.parseInt(br.readLine()) - 1;
					double percentage = Double.parseDouble(br.readLine()) / 100;
					
//					System.out.println("Stream: " + a[splitIndex]);
//					System.out.println("Percent: " + percentage);
					
					a = split(a, a.length, splitIndex, percentage);
					
//					for (int j = 0; j < a.length; j++) {
//						if (a[j] != 0) {
//							System.out.print(a[j] + " ");
//						}
//					}
				}
				
				else if (typeInt == 88) {
//					System.out.println("Merge!");
					
					int mergeIndex = Integer.parseInt(br.readLine()) - 1;
					
					a = merge(a, a.length, mergeIndex);
					
//					for (int j = 0; j < a.length - 1; j++) {
//						if (a[j] != 0) {
//							System.out.print(a[j] + " ");
//						}
//					}
				}
			}

		}

	}
	
	public static double[] split(double[] a, int n, int splitIndex, double percentage) {
		double[] a2 = new double[n + 1];
		int i = 0;
		int i2 = 0;
		while (i < n) {
			if (i != splitIndex) {
				a2[i2] = a[i];
			}
			else {
				a2[i2]   = a[i] * percentage;
				a2[i2+1] = a[i] * (1 - percentage);
				i2++;
			}
			i++;
			i2++;
		}
		return a2;
	}
	
	public static double[] merge(double[] a, int n, int mergeIndex) {
		double[] a2 = new double[n - 1];
		
		int i = 0;
		for (int i2 = 0; i2 < n - 1; i2++) {
			if (i != mergeIndex) {
				a2[i2] = a[i];
			}
			else {
				a2[i2] = a[i] + a[i+1];
				i++;
			}
			i++;
		}
		
		return a2;
	}
}
