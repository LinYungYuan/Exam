package medium;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(lengthOfLongestSubstring(""));

	}

	public static int lengthOfLongestSubstring(String s) {

		Set<Character> set = new HashSet<>();
		int length = 0;
		int removeLeft = 0;

		for (int i = 0; i < s.length(); i++) {

			if (!set.contains(s.charAt(i))) {

				set.add(s.charAt(i));
				length = Math.max(length, set.size());

			} else {

				while (set.contains(s.charAt(i))) {
					set.remove(s.charAt(removeLeft));
					removeLeft++;
				}
				set.add(s.charAt(i));
			}

		}

		return length;

	}
}
