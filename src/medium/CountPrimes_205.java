package medium;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countPrimes(10));

	}

	public static int countPrimes(int n) {
		if (n <= 2)
			return 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			int count = 1;

			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

			}

			if (count == 2) {
				list.add(i);
			}

		}
		System.out.println(list);
		return list.size();

	}

}
