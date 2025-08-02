// Last updated: 8/2/2025, 3:16:22 PM
class Solution {
    public int triangularSum(int[] nums) {
        return tri_sum(nums,nums.length);
    }
    public static int tri_sum(int[] nums,int n){
        if(n==1){
            return nums[0];

        }
        for(int i=0;i<nums.length-1;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
        return tri_sum(nums,n-1);
    }
}