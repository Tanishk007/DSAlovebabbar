package KelementinMatrix;

import java.util.PriorityQueue;

public class Bruteforce {
	public static int kthsmallest(int[][] arr, int n , int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				pq.add(arr[i][j]);
			}
		}
		int c =0;
		while(!pq.isEmpty()) {
			int temp = pq.poll();
			c++;
			
			if(c ==k)
				return temp;
		}
		return -1;
	}
	public static void main(String[]args) {
		int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };
		
		int res = kthsmallest(mat,4,7);
		System.out.println("7th smallest element is" +res);
	}
}
