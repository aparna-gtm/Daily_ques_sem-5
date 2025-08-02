// Last updated: 8/2/2025, 3:13:56 PM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        if(ispossible(1,nums.clone(),k) || ispossible(-1,nums.clone(),k)){
            return true;
        }
        return false;
        
        
    }
    public static boolean ispossible(int target,int[] nums,int k){
        int opr=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=target){
                nums[i]*=-1;
                nums[i+1]*=-1;
                opr++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
                return false;
            }
        }
        return opr<=k;
    }
}