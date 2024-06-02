package Test;

public class Test3 {
	static void shiftnos(int[] arr, int left , int right) {
		while(left<=right) {
			// both the elemnts are -ve
			
			
			if(arr[left]<0 && arr[right]<0)
				left++;
			// to ccheck left is havaing +ve and right is having -ve
			else if(arr[left]>0 && arr[right]<0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				
			}
			// to check both elemsnts haveing +ve
			else if(arr[left]>0 && arr[right]>0)
				right--;
			else {
				left++;
				right--;
			}
		}
	}
	// print the array
	static void display(int[]arr,int right) {
		for(int i =0;i<=right;++i)
			System.out.println(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[]args) {
		int [] arr = { -12, 11, -13, -5, 
                6, -7, 5, -3, 11 };
		int arr_size = arr.length;
		shiftnos(arr,0,arr_size-1);
		display(arr,arr_size-1);
	}

}
