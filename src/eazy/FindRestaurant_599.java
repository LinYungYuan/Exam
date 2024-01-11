package eazy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant_599 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map1 = new HashMap<>();
		for (int index = 0; index < list1.length; index++) {
			map1.put(list1[index], index);

		}
		List<String> strArr = new ArrayList<>();

		int indexSum = Integer.MAX_VALUE;

		for (int index = 0; index < list2.length; index++) {
			//若有包含在內再取出index來相加，如果夾出來的值比上次小就先清空list再放進去，相等的話直接放進list
			if (map1.containsKey(list2[index])) {
				
				if (map1.get(list2[index]) + index < indexSum) {

					strArr.clear();
					strArr.add(list2[index]);
					indexSum = map1.get(list2[index]) + index;

				} else if (map1.get(list2[index]) + index == indexSum) {
					strArr.add(list2[index]);
				}

			}

		}

		return strArr.toArray(new String[strArr.size()]);
	}

}
