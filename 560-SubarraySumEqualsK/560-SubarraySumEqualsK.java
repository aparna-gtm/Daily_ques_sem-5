// Last updated: 8/2/2025, 3:20:22 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

           
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                
                if (sum == k) {
                    count++;
                
                }
            }
        }

        return count;
    }
}
