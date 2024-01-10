import java.util.ArrayList;
import java.util.List;

public class Generate_118 {
	// 118
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> ans = new ArrayList<>();

		// 1
		// 11
		// 121
		// 1331
		// 14641

		for (int row = 0; row < numRows; row++) {

			List<Integer> rowList = new ArrayList<>();
			for (int col = 0; col <= row; col++) {

				if (col == 0 || col == row) {
					rowList.add(1);
				} else {
					rowList.add(ans.get(row - 1).get(col - 1) + ans.get(row - 1).get(col));
				}

			}
			ans.add(rowList);
		}

		return ans;

	}

}
