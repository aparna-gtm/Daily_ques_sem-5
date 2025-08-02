// Last updated: 8/2/2025, 3:14:28 PM
class Solution {
    public int subarraySum(int[] nums) {
        int start=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(0, i - nums[i]);
            for(int j=start;j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}