package Test;

public class Test6pairsocut {
	public static void    getpairs(int arr[] ,  int K) {
		int count =0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if((arr[i]+arr[j] )== K)
						count++;
	   System.out.printf("COunt pairs of is%d",count);
}
	public static void main(String[]args) {
		int[]arr = {1,5,7,-1};
		int k =6;
		getpairs(arr,k);
	}

}
