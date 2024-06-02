package Commonelementsinarow;

import java.util.HashMap;
import java.util.Map;

public class Approach {
	static int M =4;
	static int N =5;
	
	// print all the common elemnets in matrix 
	static void printcommonelement(int mat[][]) {
		Map<Integer,Integer> mp = new HashMap<>();
		
		// intiliaze the1 st value of matrix with vlaue 1
		for(int j =0;j<N;j++)
			mp.put(mat[0][j],1);
		
		// traverse the matrix 
		 for(int i=1;i<M;i++) {
			 for(int j=0;j<N;j++) {
				 // check if the lekent us present n the row and duplicate sets of the numer in matrix
				 if(mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
					 // if we incre the valueof the value of thelelement
					 mp.put(mat[i][j],i+1);
					 
					 // if thsi sis teh last row
					 if(i ==M-1)
						 System.out.println(mat[i][j]+" ");
				 }
			 }
		 }
		 
	}
	public static void main(String[]args) {
		int mat[][] = 
		    { 
		        {1, 2, 1, 4, 8}, 
		        {3, 7, 8, 5, 1}, 
		        {8, 7, 7, 3, 1}, 
		        {8, 1, 2, 7, 9}, 
		    }; 
		printcommonelement(mat);
	}

}
