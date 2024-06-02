package LongestPalndromic;

import java.util.Arrays;

public class DPuse {

	public int solveTab(String a, String b) {
		int[] curr = new int[b.length() + 1];
		int[] next = new int[b.length() + 1];
		for (int i = a.length() - 1; i >= 0; i--) {
			for (int j = b.length() - 1; j >= 0; j--) {
				int ans = 0;
				if (a.charAt(i) == b.charAt(j)) {
					ans = 1 + next[j + 1];
				} else {
					ans = Math.max(next[j], curr[j + 1]);
				}
				curr[j] = ans;
			}
			next = Arrays.copyOf(curr, curr.length);
		}
		return next[0];
	}

	public int longestPalindromeSubseq(String s) {
		StringBuilder revStr = new StringBuilder(s);
		revStr.reverse();
		int ans = solveTab(s, revStr.toString());
		return ans;
	}

	public static void main(String[] args) {
		DPuse solution = new DPuse();
		String input = "abcbca";
		int result = solution.longestPalindromeSubseq(input);
		System.out.println("Longest Palindromic Subsequence length: " + result);
	}
}
