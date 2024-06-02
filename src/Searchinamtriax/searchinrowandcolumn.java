package Searchinamtriax;

public class searchinrowandcolumn {
	public static int search (int[][]m, int n , int x) {
		if(n==0)
			return -1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++)
				if(m[i][j] ==x) {
					System.out.println("Elelemnts is found at(" +i+","+j+")\n");
					return 1;
				}
			
		}
		System.out.println("Elements is not found");
		return 0;
	}
	public static void main(String[]args) {
		int mat[][] = {{ 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }};
		search(mat,4,29);
		
	}

}
