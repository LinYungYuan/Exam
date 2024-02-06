package hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(wordBreak(null, null));
		

	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		
		
		Set<List<String>> set = new HashSet<>();
		
		for (String string : wordDict) {
			List<String>  list= new ArrayList<>();
			
			if(s.contains(string)) {
				list.add(string);
			}
			
		}
		
		
		return null;

	}
}
