// Last updated: 8/2/2025, 3:18:56 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=nums.length-3;i>=0;i--){
            int one=nums[i];
            int two=nums[i+1];
            int three=nums[i+2];
            if(one+two>three){
                max=Math.max(one+two+three,max);
                return max;
            }
        }
        return max;
    }
}