package LongestCommonSequence;

import java.util.Arrays;

public class Bottomup {
    public int solve(String a, String b, int i, int j, int[][] dp) {
        // Base case
        if (i == a.length() || j == b.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];   
        }
        int ans = 0;
        if (a.charAt(i) == b.charAt(j)) {
            ans = 1 + solve(a, b, i + 1, j + 1, dp);
        } else {
            ans = Math.max(solve(a, b, i + 1, j, dp), solve(a, b, i, j + 1, dp));
        }
        return dp[i][j] = ans;
    }

    public int solveTab(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            for (int j = b.length() - 1; j >= 0; j--) {
                int ans = 0;
                if (a.charAt(i) == b.charAt(j)) {
                    ans = 1 + dp[i + 1][j + 1];
                } else {
                    ans = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
                dp[i][j] = ans;
            }
        }
        return dp[0][0];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        // Uncomment below lines if you want to use recursive solve method
        // int[][] dp = new int[text1.length()][text2.length()];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // return solve(text1, text2, 0, 0, dp);
        
        return solveTab(text1, text2);
    }

    public static void main(String[] args) {
        Bottomup solution = new Bottomup();
        String text1 = "abcde";
        String text2 = "ace";
        int result = solution.longestCommonSubsequence(text1, text2);
        System.out.println("Length of longest common subsequence: " + result);
    }
}