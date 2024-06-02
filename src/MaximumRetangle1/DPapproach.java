package MaximumRetangle1;

import java.util.Arrays;

public class DPapproach {
	public static int maximumReactnagle(char[][] matrix) {
		if(matrix == null || matrix.length ==0) {
			return 0;
		}
		int n = matrix.length;
		int m = matrix[0].length;
		int[] left= new int[n];
		int[] right= new int[n];
		int[] height= new int[n];
		
		
		Arrays.fill(right, n);
		int maxArea =0;
		
		for(char[] row:matrix) {
			int curleft =0 , curright=0;
			
			// updat ethe highet of the array
			for(int j =0;j<n;j++) {
				if(row[j] =='1') {
					height[j]++;
				}else {
					height[j] =0;
				}
			}
			
			// updat ethe boundary array
			for(int j = n-1;j>=0;j--) {
				if(row[j] =='1') {
					right[j] = Math.min(right[j],curright);
				}else {
					right[j]=n;
					curright =j;
					
				}
			}
			
			//c alcluate the area of each cell 
			for(int j=0;j<n;j++) {
				maxArea = Math.max(maxArea,right[j]-left[j]*height[j]);
			}
		}
		return maxArea;
	}
	
	public static void main(String[]args) {
		char[][]matrix = {
	            {'0', '1', '1', '0'},
	            {'1', '1', '1', '1'},
	            {'1', '1', '1', '1'},
	            {'1', '1', '0', '0'}
	        };
		System.out.println(maximumReactnagle(matrix));
	}

}
