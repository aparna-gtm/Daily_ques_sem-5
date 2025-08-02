// Last updated: 8/2/2025, 3:16:57 PM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=0;
       
        int res=0;
        long cursum=0;
        while(r<nums.length){
            long target=nums[r];
            cursum+=nums[r];
          
           
            if((r-l+1)*target - cursum>k){
                cursum-=nums[l];
                l++;
                
                
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}