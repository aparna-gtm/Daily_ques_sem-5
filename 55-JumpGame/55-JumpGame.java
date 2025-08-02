// Last updated: 8/2/2025, 3:24:33 PM
class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]); 
            if (reachable >= nums.length - 1) {
                
                return true;
            }
        }
        return false;
    }
}
