// Last updated: 8/2/2025, 3:17:08 PM
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        long diff = Math.abs(goal-total);
        return (int) Math.ceil((double) diff/ limit);
    }
}