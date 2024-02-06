package medium;

import java.util.Arrays;

public class ThreeSumClosest_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);
		int ans = 0;

		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (k > j) {
				int sum = nums[i] + nums[j] + nums[k];
				if (target == sum) {
					ans = sum;
					return ans;
				}
				if (Math.abs(sum - target) < Math.abs(ans - target)) {
					ans = sum;
				}
				if (target < sum) {
					j++;
				} else {
					k--;
				}

			}
		}

		return ans;
	}

}
