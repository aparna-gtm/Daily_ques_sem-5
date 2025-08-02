// Last updated: 8/2/2025, 3:15:38 PM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] prefix=new long[nums.length];
        long max=nums[0];
        long score=0;
        prefix[0]=nums[0]*2;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                
            }
          

            prefix[i]=prefix[i-1]+nums[i]+max;
            
        }
        return prefix;
    }
}