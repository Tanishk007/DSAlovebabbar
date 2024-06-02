package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hashing {
	public static List<List<String>> Anagrams(String[] string_list){
		HashMap<String,List<String>> mp  =  new HashMap<>();
		List<List<String>> ans  = new ArrayList<>();
		
		for(String i: string_list) {
			char ch[] = i.toCharArray();
			Arrays.sort(ch);
			
			String s = String.valueOf(ch);
			
			if(mp.containsKey(s)) {
				mp.get(s).add(i);
			}
			else {
				List<String> li  = new ArrayList<>();
				li.add(i);
				mp.put(s,li);
			}
		}
		for(List<String> list:mp.values())
			ans.add(list);
		
		return ans;
	}
	
	public static void main (String[]args) {
		String arr[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs", "cat", "act", "tca"};
		System.out.println(Anagrams(arr));
	}

}
