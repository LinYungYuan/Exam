package eazy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWords_500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findWords(new String[] { "a","b" });
	}

	public static String[] findWords(String[] s) {

		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < s.length; i++) {

			set.clear();

			int wordsLen = s[i].toCharArray().length;

			for (int j = 0; j < wordsLen; j++) {

				if ("qwertyuiop".indexOf(s[i].toLowerCase().charAt(j)) >= 0) {
					set.add("a");
				} else if ("asdfghjkl".indexOf(s[i].toLowerCase().charAt(j)) >= 0) {
					set.add("b");
				} else if ("zxcvbnm".indexOf(s[i].toLowerCase().charAt(j)) >= 0) {
					set.add("c");
				}

			}

			if (set.size() == 1) {
				list.add(s[i]);
			}
			
		}
		System.out.print(list);
		return list.toArray(new String[list.size()]);

	}

}
