package MiniumSwapasofK;

public class miniswaps {
	static int minSwap(int[]a, int n , int k) {
		int good =0,bad=0;
		for(int i=0;i<n;i++) {
			if(a[i]<=k)
				good++;
		}
		for(int i=0;i<good;i++) {
			if(a[i]>k)
				bad++;
		}
		int i=0,j=good,ans=bad;
		while(j<n) {
			if(a[i]>k)
				bad--;
			if(a[j]>k)
				bad++;
			ans = Math.min(ans,bad);
			i++;j++;
		}
		return ans;
		
	}
	public static void main(String[]args) {
		int[]a = {1,2,5,3,7};
		int n = a.length;
		int k=3;
		System.out.println(minSwap(a,n,k));
	}

}
