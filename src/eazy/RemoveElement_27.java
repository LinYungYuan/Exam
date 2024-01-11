package eazy;

public class RemoveElement_27 {
	//27
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int [] {3,2,2,3};
		
		System.out.println(removeElement(nums, 3));
		
		System.out.print(nums);
	}

	public static int removeElement(int[] nums, int target) {

		int left = 0;

		for (int right = 0; right < nums.length; right++) {

			if (nums[right] != target) {

				nums[left] = nums[right];
				left++;
			}
		}

		return left;
	}
}
