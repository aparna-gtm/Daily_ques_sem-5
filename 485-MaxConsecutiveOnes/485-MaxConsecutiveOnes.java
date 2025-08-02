// Last updated: 8/2/2025, 3:20:40 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0; 
        int j=0;
        while(j<nums.length){
            if(nums[j]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
            j++;
        }
        max=Math.max(max,count);
        return max;
    }
}