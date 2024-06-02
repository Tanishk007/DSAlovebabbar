package WordBreak;

import java.util.HashSet;
import java.util.Set;

public class checkall {
	public static Set<String> dict = new HashSet<>();
	public static void main(String[]args) {
		String temp_dict[] = {
				"mobile","samsung","sam","sung", 
                "man","mango","icecream","and", 
                "go","i","like","ice","cream"
		};
		for(String temp: temp_dict) {
			dict.add(temp);
		}
		
		System.out.println(wordBreak("ilikesamsung"));
        System.out.println(wordBreak("iiiiiiii"));
        System.out.println(wordBreak(""));
        System.out.println(wordBreak("ilikelikeimangoiii"));
        System.out.println(wordBreak("samsungandmango"));
        System.out.println(wordBreak("samsungandmangok"));
	}
	
	public static boolean wordBreak(String word) {
		int size = word.length();
		
		if(size ==0)
			return true;
		
		for(int i =1;i<=size;i++) {
			if(dict.contains(word.substring(0,i)) && wordBreak(word.substring(i,size)))
			return true;
		}
		return false;
	}

}
// Time complexity :- O(n^2)
// Space complexity :- O(n)
