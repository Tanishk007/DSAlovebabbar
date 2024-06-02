package Noofcustogetcompt;

public class Soution {
	static int MAX_CHAR =256;
	// n is the number of cafe, 
	// 'seq' is given sequence customer entry , exit events
	
	static int runcustomer(int n, char[] seq) {
		// seen[i] = 0, indicates that customer 'i' is not in cafe 
			    // seen[1] = 1, indicates that customer 'i' is in cafe but 
			    //         computer is not assigned yet. 
			    // seen[2] = 2, indicates that customer 'i' is in cafe and 
			    //         has occupied a computer.
		char[] seen = new char[MAX_CHAR];
		// Initialize result which is number of customers who could 
	    // not get any computer. 
		int res =0;
		int occupied =0; // to keep the rack of occupied computers
		
		for(int i=0;i<seq.length;i++) {
			// find the index of charcterins seen[0..25]
			int ind = seq[i]-'A';
			//if first seq of i
			if(seen[ind] == 0) {
				// set the charcter as seen
				seen[ind] =1;

	            // If number of occupied computers is less than 
	            // n, then assign a computer to new customer 
				if(occupied<n) {
					occupied++;
					// Set the current character as occupying a computer 
	                seen[ind] = 2; 
				}
				// Else this customer cannot get a computer, 
	            // increment result 
	            else
	                res++; 
			}
			// If this is second occurrence of 'seq[i]' 
	        else
	        { 
	             
	        // Decrement occupied only if this customer 
	        // was using a computer 
	        if (seen[ind] == 2) 
	            occupied--; 
	        seen[ind] = 0; 
	        } 
		}
		return res;
		
	}
	public static void main(String[] args)
	{
	    System.out.println(runcustomer(2, "ABBAJJKZKZ".toCharArray())); 
	    System.out.println(runcustomer(3, "GACCBDDBAGEE".toCharArray())); 
	    System.out.println(runcustomer(3, "GACCBGDDBAEE".toCharArray())); 
	    System.out.println(runcustomer(1, "ABCBCA".toCharArray())); 
	    System.out.println(runcustomer(1, "ABCBCADEED".toCharArray())); 
	}
	

}
