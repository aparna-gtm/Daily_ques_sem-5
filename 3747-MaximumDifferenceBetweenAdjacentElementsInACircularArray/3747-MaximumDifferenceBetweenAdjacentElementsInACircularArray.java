// Last updated: 8/2/2025, 3:14:22 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i+1]-nums[i])>max){
                max=Math.abs(nums[i+1]-nums[i]);
            }
        }
        if(Math.abs(nums[nums.length-1]-nums[0])>max){
            max=Math.abs(nums[nums.length-1]-nums[0]);
        }
        return max;
    }
}