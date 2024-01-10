import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isIsomorphic(String s, String t) {


		Map<Character, Character> temp1 = new HashMap<>();
		Map<Character, Character> temp2 = new HashMap<>();


		for (int i = 0; i < s.length(); i++) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);

			if ((temp1.containsKey(s1) && temp1.get(s1) != t1) || (temp2.containsKey(t1) && temp2.get(t1) != s1)) {
				return false;

			}

			temp1.put(s1, t1);
			temp2.put(t1, s1);

		}

		return true;

	}

}
