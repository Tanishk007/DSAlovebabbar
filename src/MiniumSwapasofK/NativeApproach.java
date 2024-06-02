package MiniumSwapasofK;
// use arrays as a snowballs 
public class NativeApproach {
	static int minswap(int arr[] , int n , int k) {
		int snowballsize = 0;
		 for(int i=0;i<n;i++) {
			 if(arr[i]<k) {
				 snowballsize++;
			 }
		 }
		 int swap =0,ans_swaps = Integer.MAX_VALUE;
		 
		 for(int i =0;i<snowballsize;i++) {
			 if(arr[i]>k)
				 swap++;
		 }
		 ans_swaps = Math.min(ans_swaps, swap);
		 
	        for (int i = snowballsize; i < n; i++) {
	 
	            // Checking in every window no. of swaps
	            // required and storing its minimum
	            if (arr[i - snowballsize] <= k && arr[i] > k)
	                swap++;
	            else if (arr[i - snowballsize] > k
	                     && arr[i] <= k)
	                swap--;
	            ans_swaps = Math.min(ans_swaps, swap);
	        }
	        return ans_swaps;
	}
	
	public static void main(String[] args)
    {
        int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
        int n = arr1.length;
        int k = 5;
 
        System.out.println(minswap(arr1, n, k));
    }

}
