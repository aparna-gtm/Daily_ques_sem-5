// Last updated: 8/2/2025, 3:17:41 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int flip=0;
        int ans=0;
        int i=0;
        int j=0;
        while(j<nums.length){

            if(nums[j]==0){
                flip++;
            }
            while(flip>1 && i<=j){
                if(nums[i]==0){
                    flip--;
                }
                //ans=Math.max(ans,j-i+1);
                
                i++;
            }
             ans=Math.max(ans,j-i);
            j++;
        }
        if(ans==nums.length){
            return ans-1;
        }
        return ans;
    }
}