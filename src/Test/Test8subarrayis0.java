package Test;

import java.util.HashMap;

public class Test8subarrayis0 {
    public int subarraySum(int[] nums, int k) {
        int res =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            sum =sum+nums[i];// 13 7

            if(sum==k)res++;
            // 10-3 =7
            if(map.containsKey(sum-k)){
                res= res+ map.get(sum-k);
                }


            if(!map.containsKey(sum))map.put(sum,0);
            map.put(sum,map.get(sum)+1);
        }
        return res;
    }
}
