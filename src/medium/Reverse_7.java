package medium;

public class Reverse_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));

	}

	public static int reverse(int x) {

		int num = Math.abs(x);

		long rev = 0;

		while (num == 0) {

			int ld = num % 10;

			rev = rev * 10 + ld;
			num = num / 10;

			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
				return 0;
			}
		}

		return (x < 0) ? (int) (-1 * rev) : (int) rev;

	}
}
