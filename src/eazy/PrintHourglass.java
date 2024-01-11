package eazy;

public class PrintHourglass {

	public static void main(String[] args) {

		printHourglass(7);
	}

	public static void print(String x) {

		System.out.print(x);

	}

	public static void println() {

		System.out.println();

	}

	public static void printHourglass(int num) {

		if (num % 2 == 0) {
			print("請輸入奇數");
			return;
		}

		for (int a = 0; a < num * 2; a++) {
			boolean flag = true;
			for (int b = 0, c = num; b <= num || c >= 0; b++, c--) {
				if (a < num) {
					if (b <= a) {
						print(" ");
					} else {
						print("* ");

					}
				} else if (a > num) {
					int y = a - num;
					if ((c - y) > 0) {
						print(" ");
					} else {
						print("* ");
					}
				} else {
					flag = false;
				}

			}
			if (flag) {
				println();
			}
		}
	}
}
