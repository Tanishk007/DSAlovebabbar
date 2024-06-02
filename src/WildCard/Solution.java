package WildCard;

class Solution {

    public boolean solve(String str, String pattern, int i, int j, int[][] dp) {
        // Base case: if both strings are fully matched
        if (i < 0 && j < 0) {
            return true;
        }

        // Base case: if pattern is exhausted but str is not
        if (i >= 0 && j < 0) {
            return false;
        }

        // Base case: if str is exhausted but pattern is not
        if (i < 0 && j >= 0) {
            for (int k = 0; k <= j; k++) {
                // If there's any character other than '*' in pattern, return false
                if (pattern.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        }

        // Check memoization table
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        boolean result;

        // Match case: current characters match or pattern has '?'
        if (str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?') {
            result = solve(str, pattern, i - 1, j - 1, dp);
        } else if (pattern.charAt(j) == '*') {
            // '*' can match zero or more characters
            result = solve(str, pattern, i - 1, j, dp) || solve(str, pattern, i, j - 1, dp);
        } else {
            // Characters don't match
            result = false;
        }

        // Memoize the result
        dp[i][j] = result ? 1 : 0;
        return result;
    }

    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()][p.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                dp[i][j] = -1; // Initialize memoization table with -1
            }
        }
        return solve(s, p, s.length() - 1, p.length() - 1, dp);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("abcd", "a*d")); // Output: true
        System.out.println(solution.isMatch("abcd", "a*c")); // Output: false
    }
}
