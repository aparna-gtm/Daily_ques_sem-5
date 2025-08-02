// Last updated: 8/2/2025, 3:17:03 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int si=0;
        int max=nums[0];
        for(int ei=1;ei<nums.length;ei++){
            if(nums[ei-1]<nums[ei]){
                sum+=nums[ei];
            }
            else{
                max=Math.max(sum,max);
                sum=nums[ei];
                si=ei;
            }
        }
        max=Math.max(max,sum);
        return max;
    }
}