// Last updated: 8/2/2025, 3:24:02 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c<2 || nums[i]!=nums[c-2]){
                nums[c++]=nums[i];
            }

        }
        return c;
    }
}