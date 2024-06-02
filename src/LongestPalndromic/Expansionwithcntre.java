package LongestPalndromic;

public class Expansionwithcntre {
	static void printsubstr(String str , int low , int high ) {
		for(int i=low;i<=high;++i) {
			System.out.println(str.charAt(i));
		System.out.println();
		}
		static int longestPalSub(String s) {
			int n = s.length();
			int start =0,end =1;
			int low , hi;
			
			for(int i=0;i<n;i++) {
				// Find longest palindromic substring of even size
	            low = i - 1;
	            hi = i;
	 
	            // Expand substring while it is palindrome and in bounds
	            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
	 
	                // Update maximum length and starting index
	                if (hi - low + 1 > end) {
	                    start = low;
	                    end = hi - low + 1;
	                }
	                low--;
	                hi++;
	            }
	 
	            // Find longest palindromic substring of odd size
	            low = i - 1;
	            hi = i + 1;
	 
	            // Expand substring while it is palindrome and in bounds
	            while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {
	 
	                // Update maximum length and starting index
	                if (hi - low + 1 > end) {
	                    start = low;
	                    end = hi - low + 1;
	                }
	                low--;
	                hi++;
	            }
			}
			System.out.print("Longest palindrome substring is: ");
			printsubstr(s, start, start + end - 1);
	 
	        // Return output length
	        return end;
		}
	        public static void main(String[] args) {
	            String s = "forgeeksskeegfor";
	            int length = longestPalSub(s);
	            System.out.println("Length: " + length);
	        }
		
	}


