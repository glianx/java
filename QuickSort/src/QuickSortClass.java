import java.util.Random;

public class QuickSortClass {
	public static int [] quicksort (int [] nums) {
		Random rand = new Random();
		int pivotIndex = rand.nextInt(nums.length);
		
		int [] lowerNums;
		int [] upperNums;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= nums[pivotIndex]) {
				lowerNums[index] = (nums[i]);
			}
			else {
				upperNums.push(nums[i]);
			}
		}
	}
}
