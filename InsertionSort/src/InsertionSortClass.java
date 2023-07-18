public class InsertionSortClass {
	public static void swap (int [] nums, int x, int y) {
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
	
	public static void main (String[] args) {
		int [] nums = {4,9,2,5,1,3,8,0,6,7};
		for (int i = 1; i < nums.length; i++) {
			int j = i; 
			while (j > 0 && nums[j] < nums[j - 1]) {
				swap(nums, j, j - 1);
				j = j - 1;
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");
		}
	}
}
