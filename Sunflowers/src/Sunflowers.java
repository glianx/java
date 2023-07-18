import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sunflowers {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [][] g = new int [N][N];
		for (int i = 0; i < N; i++) {
			String [] s = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				g[i][j] = Integer.parseInt(s[j]);
			}
		}
		if (rot0(g)) 		print0(g);
		else if (rot90(g)) 	print90(g);
		else if (rot180(g)) print180(g);
		else				print270(g);				
	}
	
	public static boolean rot0(int [][] g) {
		boolean s = true;
		for (int i = 0; i < g.length && s; i++) {
			for (int j = 0; j < g.length - 1 && s; j++) {
				if (g[i][j] > g[i][j+1]) {
					s = false;
				}
			}
		}
		for (int i = 0; i < g.length - 1 && s; i++) {
			if (g[i][0] > g[i+1][0]) {
				s = false;
			}
		}
		return s;
	}
	
	public static void print0(int [][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean rot90(int [][] g) {
		boolean s = true;
		for (int i = 0; i < g.length && s; i++) {
			for (int j = 0; j < g.length - 1 && s; j++) {
				if (g[g.length - 1 - j][i] > g[g.length - 2 - j][i]) {
					s = false;
				}
			}
		}
		for (int j = 0; j < g.length - 1 && s; j++) {
			if (g[g.length - 1][j] > g[g.length - 1][j+1]) {
				s = false;
			}
		}
		return s;
	}
	
	public static void print90(int [][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				System.out.print(g[g.length - 1 - j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean rot180(int [][] g) {
		boolean s = true;
		for (int i = 0; i < g.length && s; i++) {
			for (int j = 0; j < g.length - 1 && s; j++) {
				if (g[g.length - 1 - i][g.length - 1 - j] > g[g.length - 1 - i][g.length - 2 - j]) {
					s = false;
				}
			}
		}
		for (int i = 0; i < g.length - 1 && s; i++) {
			if (g[g.length - 1 - i][g.length - 1] > g[g.length - 2 - i][g.length - 1]) {
				s = false;
			}
		}
		return s;
	}
	
	public static void print180(int [][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				System.out.print(g[g.length - 1 - i][g.length - 1 - j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print270(int [][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				System.out.print(g[j][g.length - 1 - i] + " ");
			}
			System.out.println();
		}
	}
}
