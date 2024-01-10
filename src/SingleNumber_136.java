public class SingleNumber_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleNumber(new int[] { 4, 2, 2, 2, 2 });

	}

	public static int singleNumber(int[] nums) {

		int xor = nums[0];

		for (int i = 1; i < nums.length; i++) {

			xor = xor ^ nums[i];

		}
		System.out.println(xor);
		return xor;

	}
}
