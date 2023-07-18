public class DivisorsBruteForce {
	public static void main (String [] args) {
		int max_num_div = 1;
		int [] nums = new int [1000];
		int length  = 0;
		
		for (int i = 2; i < 1001; i++) {
			int num_div = brute_root_divisors(i);
		
			if (num_div == max_num_div) {
				nums[length] = i;
				length ++;
			}
			else if (num_div > max_num_div) {
				max_num_div = num_div;
				nums = new int [1000];
				nums[0] = i;
				length = 1;	
			}
			
		}
		
		for (int i = 0; i < length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static int get_num_divisors(int i) {
		int num_div = 1;
		for (int j = 2; j < i + 1; j++) {
			if (i % j == 0) {
				num_div ++;
			}
		}
		return num_div;
	}
	
	public static int brute_root_divisors(int i) {
		int num_div = 0;
		for (int j = 1; j * j < i + 1; j++) {
			if (i % j == 0) {
				if (j * j == i) {
					num_div += 1;
				}
				else {
					num_div += 2;
				}
			}
		}
		return num_div;
	}
}
