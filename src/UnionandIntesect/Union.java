package UnionandIntesect;

import java.util.ArrayList;
import java.util.List;

public class Union {

	public static void main(String[] args) {
		int arr1[] = {1,1,1,2,2,3,3,3};
		int arr2[] = {3,3,3,4};
		
		int left =0, right =0;
		List<Integer> list = new ArrayList<>();
		
		while(left<arr1.length || right<arr2.length) {
			
			// skip duplicate 
			
			while(left>0 && left<arr1.length && arr1[left]==arr1[left-1]) {
				left++;
			}
			
			while(right>0 && right<arr2.length && arr2[right]==arr2[right-1]) {
				right++;
			}
			
			// one array khatam ho gya to dusre pe kese jao gye 
			if(left>=arr1.length) {
				list.add(arr2[right]);
				right++;
				continue;
			}
			
			if(right>=arr2.length) {
				list.add(arr1[left]);
				left++;
				continue;
			}
			
			// comparsion b/w two arrays then 
			
			if(arr1[left]<arr2[right]) {
				list.add(arr1[left]);
				left++;
			}
			else if(arr1[left]>arr2[right]) {
				list.add(arr2[right]);
				right++;
			} else {
				list.add(arr1[left]);
				right++;
				left++;
			}
			System.out.println(list);
			
		}

	}

}
