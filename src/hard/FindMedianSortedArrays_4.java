package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedianSortedArrays_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMedianSortedArrays_4(new int[] {1,3}, new int[] {2,4}));
	}

	public static double findMedianSortedArrays_4(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();
		for (int i : nums1) {
			list.add(i);
		}
		for (int i : nums2) {
			list.add(i);
		}

		Collections.sort(list);

		int len = list.size();
		double sum = 0;
		if (len % 2 == 0) {
			int mediumLen = len / 2;
			sum = (list.get(mediumLen - 1) + list.get(mediumLen )) / 2.0;
		} else if (len % 2 == 1) {
			int mediumLen = len / 2;
			sum = list.get(mediumLen );
		}

		return sum;

	}
}
