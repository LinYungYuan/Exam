package medium;

import java.util.HashMap;
import java.util.Map;

public class Convert_6 {

	public static void main(String[] args) {

	}

	public static String convert(String s, int numRows) {

		Map<Integer, String> map = new HashMap<>();

		for (int i = 1; i < s.length() + 1; i++) {
			
			map.put(i, map.get(numRows) + s.charAt(i-1));

		}

		return s;

	}
}
