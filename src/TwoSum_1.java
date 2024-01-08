
public class TwoSum_1 {
	//1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];

		for (int x = 0; x < nums.length; x++) {
			result[0] = x;
			for (int y = (x + 1); y < nums.length; y++) {

				if ((nums[x] + nums[y]) == target) {
					result[1] = y;
					return result;
				}
			}
		}

		return null;
	}
	/*
	 *  佳解
	 */
//	public int[] twoSum(int[] numbers, int target) {
//	    int[] result = new int[2];
//	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	    for (int i = 0; i < numbers.length; i++) {
//	        if (map.containsKey(target - numbers[i])) {
//	            result[1] = i;
//	            result[0] = map.get(target - numbers[i]);
//	            return result;
//	        }
//	        map.put(numbers[i], i);
//	    }
//	    return result;
//	}
}
