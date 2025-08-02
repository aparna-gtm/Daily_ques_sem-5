// Last updated: 8/2/2025, 3:16:12 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                ans+= (c*(c+1))/2;
                c=0;
            }
        }
        if (c!=0) ans+= (c*(c+1))/2;
        return ans;
    }
}