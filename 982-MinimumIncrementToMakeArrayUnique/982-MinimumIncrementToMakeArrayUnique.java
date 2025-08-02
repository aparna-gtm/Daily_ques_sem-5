// Last updated: 8/2/2025, 3:19:05 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                moves+= nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return moves;

    }
}