// Last updated: 8/2/2025, 3:22:24 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        int sum =0;
        while(j<nums.length){
            // grow
            sum+=nums[j];

            // shrink
            while(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
       if(ans==Integer.MAX_VALUE){
        return 0;
       }
       return ans;
        
    }
}