package OneStringtoanother;

import java.util.Arrays;

public class Solution {
	static int lcs(String s1 , String s2) {
		int n = s1.length();
		int m = s2.length();
		
		int dp[][] = new int[n+1][m+1];
		
		for(int rows[]:dp)
			Arrays.fill(rows,-1);
		
		for(int i =0;i<=n;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<=m;i++) {
			dp[0][i]=0;
		}
		
		// fill the dp array with the bottom appraoch
		for(int ind1=1;ind1<=n;ind1++) {
			for(int ind2=1;ind2<=m;ind2++) {
				if(s1.charAt(ind1-1) == s2.charAt(ind2-1))
					dp[ind1][ind2] =1+dp[ind1-1][ind2-1];
				else
					dp[ind1][ind2] = Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
			}
		}
		return dp[n][m];
	}
	static int canyoumake(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		
		// find the length of the lcs b/wstr1 and  str2
		int k =lcs(str1,str2);
		
		// The minimum operations required is the sum of the lengths of str1 and str2 minus twice the length of LCS
        return (n - k) + (m - k);
	}
	
	public static void main(String[]args) {
		String str1 = "abcd";
		String str2 = "anc";
		System.out.println("The minimum nos of operatiosn required to conert str1 to str2:"+canyoumake(str1,str2));
	}

}
