// Last updated: 8/2/2025, 3:17:15 PM
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        else if(c==1 && nums[nums.length-1]<=nums[0]){
            return true;
        }
        return false;
    }
}