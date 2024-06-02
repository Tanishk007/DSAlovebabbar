package Duplicatecharacter;

import java.util.Arrays;

public class Solution {
	public static void printduplicates(String str) {
		int len = str.length();
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		
		String sortst = new String(chars);
		
		for(int i=0;i<len;i++) {
			int count =1;
			while(i<len-1 && sortst.charAt(i) == sortst.charAt(i+1)) {
				count++;
				i++;
			}
			
			if(count>1) {
				System.out.println(sortst.charAt(i)+ ", count = "+count);
			}
		}
	}
	public static void main(String[]args) {
		String str = "Tanishk Aggarwal";
		printduplicates(str);
	}

}

// time complexity :- O(N*log N)
// space complexity :- O(1)
