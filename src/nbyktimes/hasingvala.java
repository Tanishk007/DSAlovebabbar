package nbyktimes;

import java.util.HashMap;
import java.util.Map;

public class hasingvala {
	public static void morethanNdk(int a[] , int n , int k) {
		int x = n/k;
		
		HashMap<Integer, Integer>  y = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(!y.containsKey(a[i]))
				y.put(a[i],1);
			 else {
					int count = y.get(a[i]);
					y.put(a[i],count+1);
				 }
		}
		  
	
	//iterate over the each element in the has tableahcek the 
	//frequency of itit is more thatn n/k then print it . 
	for(Map.Entry m:y.entrySet()) {
		Integer temp  = (Integer)m.getValue();
		if(temp>x)
			System.out.println(m.getKey());
	}
}
public static void main(String[]args) {
	int a[] = new int[] {1,1,2,2,3,5,4,2,2,3,1,1,1};
	int n =12;
	int k  =4;
	morethanNdk(a,n,k);
}

}
