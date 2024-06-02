package ThreeWayPartion;

public class BruteForce {
	public static void threewaypartition(int[] arr , int low , int high) {
		int n = arr.length;
		int start = 0 , end = n-1;
		
		for(int i=0;i<=end;) {
			if(arr[i]<low) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start ++;
				i++;
			}
			
			else if(arr[i]>high) {
				int temp = arr[end];
            	arr[end] = arr[i];
            	arr[i] = temp;
            	end--;
			}
			
			else
				i++;
		}
	}
	public static void main(String[]args) {
		int arr[] = {1,14,5,20,4,2,54,20,87,98,3,1,32};
		
		threewaypartition(arr,10,20);
		System.out.println("Modified Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}

///time complexity:- O(N)
// Sapce complexity :- O(1)
