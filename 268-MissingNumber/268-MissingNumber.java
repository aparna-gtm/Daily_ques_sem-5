// Last updated: 8/2/2025, 3:21:51 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actual=0;
        for(int i:nums){
            actual+=i;

        }
        return expectedSum-actual;
    }
}