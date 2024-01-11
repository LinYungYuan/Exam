package eazy;
public class IsPalindromeString_125 {
	//125
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromeString("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindromeString(String s) {

		if (s.trim().equals("")) {
			return true;
		}

		char[] c = s.trim().toCharArray();
		
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < c.length ; i++) {
			
			if (Character.isLetterOrDigit(c[i])) {
				
				sb.append(Character.toLowerCase(c[i]));
			}
		}
		
		
		char[] ch = sb.toString().toCharArray();
		
		
		for (int i = 0; i < ch.length / 2; i++) {
			
			
			if (ch[i] != ch[ch.length - i - 1]) {
				return false;
			}

		}

		return true;
	}

}
