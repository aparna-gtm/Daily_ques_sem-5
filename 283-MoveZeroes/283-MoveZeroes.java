// Last updated: 8/2/2025, 3:21:45 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        while(idx<nums.length){
            nums[idx++]=0;
        }
        

    }
}