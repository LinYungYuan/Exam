package medium;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));

	}

	public static int maxSubArray(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		int maxSum = Integer.MIN_VALUE;
		int tempSum = 0;

		for (int i = 0; i < nums.length; i++) {

			tempSum = tempSum + nums[i];

			if (tempSum > maxSum) {
				maxSum = tempSum;
			}

			if (tempSum < 0) {
				tempSum = 0;
			}

		}

		return maxSum;
	}
}
