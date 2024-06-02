package SpecificPairs;

public class MatrixBrute {
	static int findMax(int N , int mat[][]) {
		int maxvalue = Integer.MIN_VALUE;
		
		//make all the apirs of matrix[a][b] & [c][d]
		for(int a=0;a<N-1;a++)
			for(int b=0;b<N-1;b++)
				for(int d=a+1;d<N;d++)
					for(int e=b+1;e<N;e++)
						if(maxvalue<(mat[d][e] - mat[a][b]))
							maxvalue = mat[d][e] - mat[a][b];
		return maxvalue;
	}
	public static  void main(String[]args) {
		int N =5;
		int mat[][] = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
             };
		
		System.out.println("Maximum Value is"+ findMax(N,mat));
	}

}
