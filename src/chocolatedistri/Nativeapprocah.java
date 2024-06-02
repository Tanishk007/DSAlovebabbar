package chocolatedistri;

import java.util.Arrays;

public class Nativeapprocah {
	public static int chococlatedistri(int arr[],int m) {
		if(arr.length ==0 || m==0) {
			return 0;
		}
		Arrays.sort(arr);
		
		if(arr.length-1<m) {
			return -1;
		}
		
		 int min_diff = Integer.MAX_VALUE;
		 for (int i = 0; i < arr.length; i++) {
	            // Calculate the ending index of the current window
	            int nextWindow = i + m - 1;
	 
	            // Break if the window goes beyond the bounds of the array
	            if (nextWindow >= arr.length)
	                break;
	 
	            // Calculate the difference between the last and first elements in the window
	            int diff = arr[nextWindow] - arr[i];
	 
	            // Update the minimum difference if a smaller difference is found
	            min_diff = Math.min(min_diff, diff);
	        }
		 return min_diff;
	}
	public static void main(String[] args) {
        // Example input
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        // Calculate the result using the chocolateDistribution method
        int result = chococlatedistri(arr, m);
 
        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }

}
