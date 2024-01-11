package eazy;

public class SearchInsert_35 {
	//35
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int searchInsert(int[] nums, int target) {

		for (int index = 0; index < nums.length; index++) {
			if (target <= nums[index]) {

				return index;
			}

		}

		return nums.length;
	}

}
