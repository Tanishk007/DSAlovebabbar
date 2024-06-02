package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Optimizetest2 {
	public static void sortedArray(ArrayList<Integer>arr , int n) {
		int low =0 , mid =0, high = n-1 ;
		while(mid<=high) {
			if(arr.get(mid)==0) {
				// swap the arr0 and arr1 to make the sorted array
				int temp = arr.get(low);
				arr.set(low,arr.get(mid));
				arr.set(mid,temp);
				
				low++;
				mid++;
			}
			else if(arr.get(mid)==1) {
				mid++;
			}else {
				int temp = arr.get(mid);
				arr.set(mid,arr.get(high));
				arr.set(high,temp);
				
				high--;
			}
		}
	}
	public static void main(String[]args) {
		int n =6;
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0,2,1,2,0,1}));
		sortedArray(arr,n);
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(arr.get(i)+" ");
			
		}
		System.out.println();
		
	}
	
	

}
