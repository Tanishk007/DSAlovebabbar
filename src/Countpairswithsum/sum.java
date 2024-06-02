package Countpairswithsum;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,7,-1,5};
		int k =6;
		// functionc all for pairs
		getpairsCount(arr,k);

	}
	
	public static void getpairsCount(int[]arr , int k) {
		int count =0;
		for(int i =0;i<arr.length;i++)
			for(int j = i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==k)
					count++;
		System.out.printf("Count pairs of %d",count);
	}

}
