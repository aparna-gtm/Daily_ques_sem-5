// Last updated: 8/2/2025, 3:17:02 PM
class Solution {
    public int minOperations(int[] nums) {
       
        int moves=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i]<=nums[i-1]){
                moves+= nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
       
        return moves;
    }
}