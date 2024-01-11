package eazy;
public class IongestCommonPrefix_14 {
	//14
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "a" };
		IongestCommonPrefix_14.longestCommonPrefix(strs);
		System.out.println(IongestCommonPrefix_14.longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		int strLen = strs[0].length();
		int count = strs.length;

		for (int i = 0; i < strLen; i++) {

			char ch = strs[0].charAt(i);
			for (int j = 1; j < count; j++) {

				if (i == strs[j].length() || strs[j].charAt(i) != ch) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}
}
