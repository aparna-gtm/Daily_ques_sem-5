// Last updated: 8/2/2025, 3:15:44 PM
class Solution {
    public int digitSum(int n) {
        int sum = 0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for(int i=0; i<nums.length; i++) {
            elementSum+=nums[i];
            digitSum+=digitSum(nums[i]);
        }
        return Math.abs(digitSum-elementSum);   
    }
}