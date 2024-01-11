package eazy;

public class PalindromeNumber_9 {
	// 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome(10);

	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String str = String.valueOf(x);

		for (int y = 0; y < str.length() / 2; y++) {
			if (str.charAt(y) != str.charAt(str.length() - y - 1)) {
				return false;
			}
		}
		return true;
	}

}
