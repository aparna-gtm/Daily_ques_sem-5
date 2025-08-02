// Last updated: 8/2/2025, 3:24:52 PM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
            
            // Early exit if you can reach the end
            if (currentEnd >= nums.length - 1) {
                break;
            }
        }
        
        return jumps;
    }
}
