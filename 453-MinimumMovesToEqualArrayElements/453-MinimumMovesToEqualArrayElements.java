// Last updated: 8/2/2025, 3:20:45 PM
class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<min) {
                min = nums[i];
            }
        }

        for(int i=0; i<nums.length; i++) {
            moves+=nums[i]-min;
        }

        return moves;
        
    }
}