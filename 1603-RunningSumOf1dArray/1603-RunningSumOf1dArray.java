// Last updated: 8/11/2026, 2:18:32 PM
class Solution {
    public int[] runningSum(int[] nums) {
      int n=nums.length;
      int res[]=new int[n];
      int i;
      res[0]=nums[0];
      for(i=1;i<n;i++)
      res[i]=res[i-1]+nums[i];
      return res;
        
    }
}