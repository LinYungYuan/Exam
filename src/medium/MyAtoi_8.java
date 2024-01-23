package medium;

public class MyAtoi_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char a = 's';
//		System.out.print((a - '0'));
		System.out.println(myAtoi("42"));

	}

	public static int myAtoi(String s) {

		s = s.trim();
		int strLen = s.length();

		if (strLen == 0) {
			return 0;
		}

		int index = 0;
		boolean neg = (s.charAt(0) == '-');
		boolean pos = (s.charAt(0) == '+');
		if (neg || pos) {
			index++;
		}
		int ans = 0;
		while (index < strLen && Character.isDigit(s.charAt(index))) {
			int dig = s.charAt(index) - '0';
			if (ans > (Integer.MAX_VALUE / 10) || (ans == (Integer.MAX_VALUE / 10) && dig > 7)) {
				return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			ans = ans * 10 + dig;
			index++;
		}

		return neg ? -ans : ans;
	}
}
