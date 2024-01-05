
public class RomanToInteger {

	public static void main(String[] args) {

		System.out.println(romanToInt("LVIII"));

	}

	public static int romanToInt(String s) {

		char[] roman = s.toCharArray();

		int sum = 0;

		int preValue = getValue(roman[0]);

		for (int i = 1; i < roman.length; i++) {

			int temp = getValue(roman[i]);

			if (preValue < temp) {

				sum -= preValue;
			} else {

				sum += preValue;
			}
			preValue = temp;
		}
		sum += preValue; //因迴圈終止最後一筆沒加到故迴圈跑回後需要加回去
		return sum;

	}

	public static int getValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}

	}
}
