package WordBreak;

import java.util.Arrays;
import java.util.List;

public class Recursive {
	static boolean wordbreak(List<String> wordlist, String word) {
		if(word.isEmpty()) {
			return true;
		}
		int wordlen = word.length();
		
		for(int i=1;i<=wordlen;++i) {
			String prefix = word.substring(0,i);
			
			if(wordlist.contains(prefix) && wordbreak (wordlist, word.substring(i))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args) {
		List<String> wordList = Arrays.asList("mobile", "samsung", "sam", "sung", "man",
	            "mango", "icecream", "and", "go", "i", "like",
	            "ice", "cream");
		boolean result = wordbreak(wordList, "ilikesamsung");
		System.out.println(result);
	}

}
