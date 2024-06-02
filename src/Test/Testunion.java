package Test;

import java.util.ArrayList;

public class Testunion {
	public static void main(String[]args) {
		int arr1[] = {1,1,1,2,2,3,3,3};
		int arr2[] = {3,3,3,4};
		int left =0, right=0;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		while(left<arr1.length || right<arr2.length) {
			
			// skip the remove duplicate 
			while(left>0 && left<arr1.length && arr1[left]==arr1[left-1]) {
				left++;
			}
			
			while(right>0 && right<arr2.length && arr2[right]==arr1[right-1]) {
				right++;
			}
			
			// toc heck one array is exguast 
			if(left>=arr1.length) {
				result.add(arr2[right]);
				left++;
				continue;
			}
			if(right>=arr2.length) {
				result.add(arr1[left]);
				right++;
				continue;
			}
			
			//compare two arrays
			if(arr1[left]<arr2[right]) {
				result.add(arr2[right]);
				right++;
			}
			
			if(arr2[right]<arr1[left]) {
				result.add(arr1[left]);
				left++;
			}else {
				result.add(arr1[left]);
				right++;
				left++;
				
			}
			System.out.println(result);

		}
		
	}

}
