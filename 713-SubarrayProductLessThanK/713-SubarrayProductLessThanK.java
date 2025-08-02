// Last updated: 8/2/2025, 3:19:59 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int ans=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            // grow
            pro*= nums[j];

            // shrink
            while(pro>=k && i<=j){
                pro/=nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}