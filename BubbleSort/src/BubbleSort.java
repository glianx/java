public class BubbleSort {
	public static boolean swap (int [] nums, int x, int y) {
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
		return true;
	}
	
	public static void main (String[] args) {
		int [] nums = {4,9,2,5,1,3,8,0,6,7};
		for (int i = 0; i < nums.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j+1]) {
					swapped = swap(nums, j, j + 1);
					for (int k = 0; k < nums.length; k++) {
						System.out.print(nums[k] + " ");
					}
					System.out.println();
				}
			}
			if (!swapped) {
				break;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
}