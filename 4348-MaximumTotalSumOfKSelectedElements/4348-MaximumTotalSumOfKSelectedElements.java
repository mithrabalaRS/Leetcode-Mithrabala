// Last updated: 8/11/2026, 2:16:13 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
       Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        List<Integer> co=new ArrayList<>();
        for(int m=mul;m>=mul-k+1;m--){
            co.add(Math.max(1,m));
        }
        Collections.sort(co);
        for(int i=0;i<k;i++){
            ans+=1L*nums[n-k+i]*co.get(i);
        }
        return ans;
    }
}