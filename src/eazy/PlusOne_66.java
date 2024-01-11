package eazy;

public class PlusOne_66 {
	//66
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 1, 2, 3 };
		int[] digits2 = { 2, 2, 9 }; //{2,3,0}
		//123+1=124
		//223+1=224
		//229+1=230
		plusOne(digits);

	}

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i > -1; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		// 只有全部的位數都是 9 的情況才會跑完迴圈，故只要將第一位變成 1 就好
		int[] result = new int[digits.length + 1];
		result[0] = 1;

		return result;
	}
}
