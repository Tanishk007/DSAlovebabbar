package SubsetsofString;
import java.util.ArrayList;
import java.util.List;
public class Subsets {
	

	
	    public static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
	        // base case
	        if (index >= nums.length) {
	            ans.add(new ArrayList<>(output));
	            return;
	        }
	        // exclude
	        solve(nums, output, index + 1, ans);
	        // include
	        int element = nums[index];
	        output.add(element);
	        solve(nums, output, index + 1, ans);
	        output.remove(output.size() - 1); // backtrack
	    }

	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<>();
	        List<Integer> output = new ArrayList<>();
	        int index = 0;
	        solve(nums, output, index, ans);
	        return ans;
	    }
	


}
