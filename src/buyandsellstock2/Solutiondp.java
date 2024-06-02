package buyandsellstock2;

import java.util.List;
import java.util.Arrays;

public class Solutiondp{

    // Memoization table
    private int[][] dp;

    // Top-down DP function to calculate the maximum profit
    public int solve(int index, int buy, List<Integer> prices) {
        // Base case: if index reaches the end of the list
        if (index == prices.size()) {
            return 0;
        }

        // Check if the result is already calculated
        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit = 0;
        if (buy == 1) {
            // Option 1: Buy the stock
            int buyStock = -prices.get(index) + solve(index + 1, 0, prices);
            // Option 2: Skip buying the stock
            int skipBuy = 0 + solve(index + 1, 1, prices);
            // Maximum profit between buying and skipping
            profit = Math.max(buyStock, skipBuy);
        } else {
            // Option 1: Sell the stock
            int sellStock = prices.get(index) + solve(index + 1, 1, prices);
            // Option 2: Skip selling the stock
            int skipSell = 0 + solve(index + 1, 0, prices);
            // Maximum profit between selling and skipping
            profit = Math.max(sellStock, skipSell);
        }

        // Store the result in the memoization table
        dp[index][buy] = profit;
        return profit;
    }

    // Function to initialize the memoization table and start the DP process
    public int maxProfit(List<Integer> prices) {
        int n = prices.size();
        // Initialize the memoization table with -1 (unvisited state)
        dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Start the top-down DP process
        return solve(0, 1, prices);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> prices = List.of(7, 1, 5, 3, 6, 4);
        System.out.println("Maximum Profit: " + solution.maxProfit(prices));  // Example usage
    }
}
