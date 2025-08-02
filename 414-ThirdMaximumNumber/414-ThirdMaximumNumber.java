// Last updated: 8/2/2025, 3:21:03 PM
class Solution {
    public int thirdMax(int[] nums) {
       long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third =  Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            if (num > second && num < first) {
                third = second;
                second = num;
            }
            if (num < first && num < second && num > third) {
                third = num;
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}