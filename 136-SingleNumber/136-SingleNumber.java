// Last updated: 8/2/2025, 3:23:16 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}