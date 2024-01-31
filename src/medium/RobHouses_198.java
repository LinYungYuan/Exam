package medium;

import java.util.HashMap;
import java.util.Map;

public class RobHouses_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(rob(new int[] { 2, 1, 1, 2 }));

	}

	public static int rob(int[] nums) {

		Map<Integer, Integer> sum = new HashMap<>();

		if (nums.length == 0) {
			return 0;
		}

		for (int i = 0; i < nums.length; i++) {

			int newRob = sum.getOrDefault(1, 0) + nums[i];
			int newNoRob = Math.max(sum.getOrDefault(1, 0), sum.getOrDefault(0, 0));
			sum.put(0, newRob);
			sum.put(1, newNoRob);

		}

		return Math.max(sum.get(1), sum.get(0));

	}

	public int rob2(int[] nums) {
		int rob = 0;
		int norob = 0;
		for (int i = 0; i < nums.length; i++) {
			int newRob = norob + nums[i];
			int newNoRob = Math.max(norob, rob);
			rob = newRob;
			norob = newNoRob;
		}
		return Math.max(rob, norob);
	}
}
