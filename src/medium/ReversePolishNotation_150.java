package medium;

import java.util.Stack;

public class ReversePolishNotation_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int evalRPN(String[] tokens) {

		Stack<Integer> s = new Stack<>();
		int index = 0;

		while (index < (tokens.length - 1)) {

			if ("+".equals(tokens[index])) {
				//stack pop()是先進後出所以第一個取出來的是後者
				int b = s.pop();
				int a = s.pop();
				//但四則運算還是需要從前面開始
				s.add(a + b);

			} else if ("-".equals(tokens[index])) {

				int b = s.pop();
				int a = s.pop();
				s.add(a - b);

			} else if ("/".equals(tokens[index])) {

				int b = s.pop();
				int a = s.pop();
				s.add(a / b);

			} else if ("*".equals(tokens[index])) {

				int b = s.pop();
				int a = s.pop();
				s.add(a * b);

			} else {

				s.add(Integer.parseInt(tokens[index]));
			}

			index++;
		}

		return s.pop();

	}

}
