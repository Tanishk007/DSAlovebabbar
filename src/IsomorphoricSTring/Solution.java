package IsomorphoricSTring;

import java.util.Arrays;

public class Solution {
	static int size = 256;

	static String areIso(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		if (m != n)
			return "False";
		Boolean[] marked = new Boolean[size];
		Arrays.fill(marked, Boolean.FALSE);

		int[] map = new int[size];
		Arrays.fill(map, -1);

		for (int i = 0; i < n; i++) {
			if (map[str1.charAt(i)] == -1) {
				if (marked[str2.charAt(i)] == true)
					return "False";

				marked[str2.charAt(i)] = true;

				map[str1.charAt(i)] = str2.charAt(i);
			} else if (map[str1.charAt(i)] != str2.charAt(i))
				return "False";
		}
		return "True";

	}

	public static void main(String[] args) {
		String res = areIso("aab", "xxy");
		System.out.println(res);
	}

}

//Time complexity :- O(N)
// Space complexity :- O(1)0
