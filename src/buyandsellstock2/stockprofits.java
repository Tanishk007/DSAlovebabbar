package buyandsellstock2;

import java.util.Arrays;
import java.util.Vector;

public class stockprofits {
	static long MaximumProfit(long[]Arr , int  ind , int buy ,int n, Vector<Vector<Long>>dp) {
		if( ind ==0)
			return 0;
		
		if(dp.get(ind).get(buy)!=-1)
			return dp.get(ind).get(buy);
		
		long profit;
		if(buy ==0) {// we cna buy the stock
			profit = Math.max(0 + MaximumProfit(Arr,ind+1,0,n,dp),
					-Arr[ind] + MaximumProfit(Arr,ind+1,1,n,dp));
		}
		// we can sell the stock
		if(buy == 1) {
			profit = Math.max(0 + MaximumProfit(Arr,ind+1,1,n,dp),
					Arr[ind] + MaximumProfit(Arr,ind+1,0,n,dp));
		}
		
		dp.get(ind).set(buy,profit);
		return profit;
	}
	// function to cal maxim profit
	static long MaximumProfit(long[]Arr,int n) {
		
		Vector<Vector<Long>> dp = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            Vector<Long> row = new Vector<>(2);
            row.addAll(Arrays.asList(-1L, -1L));
            dp.add(row);
	}
        if (n == 0)
            return 0;
     // Calculate the maximum profit using the recursive function
        long ans = MaximumProfit(Arr, 0, 0, n, dp);
        return ans;
}
	public static void main(String[] args) {
        int n = 6;
        long[] Arr = {7, 1, 5, 3, 6, 4};

        // Calculate and print the maximum profit
        System.out.println("The maximum profit that can be generated is " + MaximumProfit(Arr, n));
    }
}
