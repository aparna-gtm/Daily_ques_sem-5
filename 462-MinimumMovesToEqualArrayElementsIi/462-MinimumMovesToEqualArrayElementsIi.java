// Last updated: 8/2/2025, 3:20:42 PM
class Solution {
    public int minMoves2(int[] nums) {
        int i=0;
        int moves=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            moves+=nums[j]-nums[i];
            i++;
            j--;
        }
        return moves;
    }
}