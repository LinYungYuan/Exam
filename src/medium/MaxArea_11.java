package medium;

public class MaxArea_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	public static int maxArea(int[] height) {

		int maxArea = 0;

		int start = 0;
		int last = height.length - 1;

		while (last - start > 0) {
			int area = Math.min(height[last], height[start]) * (last - start);
			maxArea = Math.max(maxArea, area);

			if (height[start] > height[last]) {
				last--;
			} else {
				start++;
			}
		}

		return maxArea;
	}
}
