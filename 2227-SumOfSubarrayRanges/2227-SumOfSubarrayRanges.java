// Last updated: 8/2/2025, 3:16:36 PM
class Solution {
    public long subArrayRanges(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
            for(int j=i+1;j<nums.length;j++){
                min=Math.min(nums[j],min);
                max=Math.max(nums[j],max);
                ans+=max-min;
            }
        }
        return ans;
    }
}