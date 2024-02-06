package medium;

import java.util.HashMap;
import java.util.Map;

public class Convert_6 {

	public static void main(String[] args) {

		System.out.println(convert("A", 2));

	}

	public static String convert(String s, int numRows) {
		if("".equals(s)) return "";
        if(s.length() == 1) return s;
        if(numRows == 1) return s;
        
		Map<Integer, String> map = new HashMap<>();

		boolean flag = true;
		int j = 0;
		for (int i = 0; i < s.length(); i++) {

			if (flag) {
				
				j++;
				map.put(j, map.getOrDefault(j, "") + s.charAt(i));
				if (j == numRows)
					flag = false;
			} else {
				j--;
				map.put(j, map.getOrDefault(j, "") + s.charAt(i));
				if (j == 1)
					flag = true;
			}

		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= numRows; i++) {
			sb.append(map.getOrDefault(i,""));
		}
		return sb.toString();

	}
}
