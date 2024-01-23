package medium;

public class LongestPalindrome_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(longestPalindrome("cbbd"));
	}

	public static String longestPalindrome(String s) {



		if (s.length() <= 1) {

			return s;
		}
		int maxLen = 1;
		String maxStr = s.substring(0,1);
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + maxLen; j <= s.length(); j++) {
				// 判斷是否滿足回文字串及是否為最長的條件
				if (j - i > maxLen && iPalindrome(s.substring(i, j))) {

					maxLen = j - i;
					maxStr = s.substring(i, j);
				}

			}
		}

		return maxStr;

	}

	public static boolean iPalindrome(String temp) {

		int left = 0;
		int right = temp.length() - 1;

		while (left < right) {

			if (temp.charAt(left) != temp.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
