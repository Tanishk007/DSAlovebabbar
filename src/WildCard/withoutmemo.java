package WildCard;

public class withoutmemo {

    public boolean solve(String str, String pattern, int i, int j) {
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

        // Match case: current characters match or pattern has '?'
        if (str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?') {
            return solve(str, pattern, i - 1, j - 1);
        } else if (pattern.charAt(j) == '*') {
            // '*' can match zero or more characters
            return solve(str, pattern, i - 1, j) || solve(str, pattern, i, j - 1);
        } else {
            // Characters don't match
            return false;
        }
    }

    public boolean isMatch(String s, String p) {
        return solve(s, p, s.length() - 1, p.length() - 1);
    }

    public static void main(String[] args) {
        withoutmemo solution = new withoutmemo();
        System.out.println(solution.isMatch("abcd", "a*d")); // Output: true
        System.out.println(solution.isMatch("abcd", "a*c")); // Output: false
    }
}

