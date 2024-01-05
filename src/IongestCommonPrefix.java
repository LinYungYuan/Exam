public class IongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "flower", "flow", "flight" };
		IongestCommonPrefix.longestCommonPrefix(strs);

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length <= 1) {
			return "";
		}
		String result = "";
		String str = strs[0];
		char[] res = str.toCharArray();

		for (int a = 1; a < strs.length; a++) {

			for (int b = 1; b < res.length; b++) {
				String temp = str.substring(0, b);
				if (strs[a].contains(temp)) {
					result = strs[a].substring(strs[a].indexOf(temp), temp.length());
				}
			}
			str = result;
			res = result.toCharArray();

		}
		System.out.println(result);
		return result;
	}
}
