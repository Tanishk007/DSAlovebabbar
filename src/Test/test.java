package Test;

import java.util.Arrays;

//public class test {
//	public static void main(String[]args) {
//		int[] arr = new int[] {4,5,6,8,10,2};
//		int max = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max)
//				max = arr[i];
//		}
//		System.out.println("printe the largest eements"+max);
//		
//		//int[] arr = new int[] {4,5,6,8,10,2};
//		int min = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min)
//				min = arr[i];
//		}
//		System.out.println("printe the largest eements"+min);
//	}
//
//}

public class test {
    public static int findKthSmallest(Integer[] nums, int k) {
        Arrays.sort(nums);
        return(k-1);
        
    }
    public static void main(String[]args){
        Integer nums[] = new Integer[] {3,2,1,5,6,4};
        int k =2;
        // Function call
        System.out.print("K'th smallest element is "
                         + findKthSmallest(nums, k));
    }
}
