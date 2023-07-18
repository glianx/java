public class SelectionSort {
	public static void swap (int [] nums, int x, int y) {
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
	
	public static void main (String[] args) {
		int [] nums = {4,9,2,5,1,3,8,0,6,7};
		for (int i = 0; i < nums.length - 1; i++) {
			int index = i;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			swap(nums, i, index);
			
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");
		}
	}
	
}