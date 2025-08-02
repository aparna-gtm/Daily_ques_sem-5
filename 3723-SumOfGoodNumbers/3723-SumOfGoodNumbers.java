// Last updated: 8/2/2025, 3:14:29 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
      //  if(nums.length)
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if((i<=k-1 || nums[i-k]<nums[i]) && (i>=nums.length-k || nums[i+k]<nums[i]) ){
                sum+=nums[i];
            }
        }
        return sum;
    }
}