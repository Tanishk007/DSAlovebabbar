package Sortedeleinrowandcolumn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix {
	static void matrix(int N , int[][] mat) {
		List<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				temp.add(mat[i][j]);
			}
		}
		Collections.sort(temp);
		
		for(int i=0;i<temp.size();i++) {
			System.out.println(temp.get(i)+" ");
		}
	}
	
	public static void main(String[]args) {
		int N =4;
		int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		matrix(N,mat);
	}

}
