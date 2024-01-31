package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> threeSum(int[] nums) {

		// 先排序整理比較好，由小到大
		Arrays.sort(nums);

		List<List<Integer>> ans = new ArrayList<>();
		Set<List<Integer>> s = new HashSet<>();

		int target = 0;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				sum = nums[i] + nums[j] + nums[k];
				if (target == sum) {
					s.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (sum < target) {
					j++;
				} else {
					k--;
				}
				sum = 0;
			}

		}
		ans.addAll(s);
		return ans;

	}

}
