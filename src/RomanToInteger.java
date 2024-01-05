
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int romanToInt(String s) {
		int result = 0;

		char[] roman = s.toCharArray();

		for (char ch : roman) {

			switch (ch) {
				case 'I':
				case 'X':
				case 'C':
					
					
					break;
				case 'V':
					break;
				case 'L':
					break;
				case 'D':
					break;
				case 'M':
					break;
					

			}

//			I             1
//			V             5
//			X             10
//			L             50
//			C             100
//			D             500
//			M             1000
		}

		return result;

	}
}
