package eazy;

public class LengthOfLastWord_58 {
	// 58
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hello World"));

	}

	public static int lengthOfLastWord(String s) {

		s = s.trim();

		if ("".equals(s)) {
			return 0;
		}

		String x = s.substring(s.lastIndexOf(" ") + 1, s.length());

		return x.length();
	}
}
