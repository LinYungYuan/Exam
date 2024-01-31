package medium;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(String s) {

		if (s.length() <= 1) {
			return true;
		}

		s = s.toLowerCase();
		int start = 0;
		int last = s.length() - 1;

		while (start < last) {
			char startChar = s.charAt(start);
			char lastChar = s.charAt(last);

			if (!Character.isLetterOrDigit(startChar)) {
				start++;
			} else if (!Character.isLetterOrDigit(lastChar)) {
				last--;
			} else {
				if (Character.toLowerCase(startChar) != Character.toLowerCase(lastChar)) {
					return false;
				}
			}
		}

		return true;

	}
}
