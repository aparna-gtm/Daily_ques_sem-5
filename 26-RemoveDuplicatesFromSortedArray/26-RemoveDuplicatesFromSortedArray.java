// Last updated: 8/2/2025, 3:25:18 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int idx=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[idx++]=nums[i-1];
                count++;
            }
        }
        nums[idx]=nums[nums.length-1];
        count++;
        return count;
    }
}