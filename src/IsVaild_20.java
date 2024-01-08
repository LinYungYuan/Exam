import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsVaild_20 {
	//20
	public static void main(String[] args) {

		
		
		
	}

	public static boolean isValid(String s) {

		if (s.length() % 2 != 0)
			return false;

		Map<Character, Character> pairs = new HashMap<>() {
			private static final long serialVersionUID = -6422382171295280587L;

			{
				put(')', '(');
				put(']', '[');
				put('}', '{');
			}
		};
		LinkedList<Character> deque = new LinkedList<>();

		int sLen = s.toCharArray().length;
		
		for (int i = 0; i < sLen; i++) {
			if (pairs.containsKey(s.charAt(i))) {

				// 有包含key需要再檢查deque內是否已經塞入其他字元，如果沒有或是取出來的值跟pair內的不一樣的話則表示
				if (deque.isEmpty() || pairs.get(s.charAt(i)) != deque.peek()) {

					return false;
				}

				deque.pop();
			} else {

				deque.push(s.charAt(i));
			}
		}

		return deque.isEmpty();
	}

}
