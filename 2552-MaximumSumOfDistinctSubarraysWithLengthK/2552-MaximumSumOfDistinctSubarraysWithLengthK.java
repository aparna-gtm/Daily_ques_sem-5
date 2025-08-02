// Last updated: 8/2/2025, 3:15:51 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] used = new int[100001];  // Adjust size to handle larger numbers
        int i = 0, j = 0;
        long maxSum = 0, sum = 0;

        while (j < nums.length) {
            sum += nums[j];
            used[nums[j]]++;

            while (used[nums[j]] > 1) {
                sum -= nums[i];
                used[nums[i]]--;
                i++;
            }

            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[i];
                used[nums[i]]--;
                i++;
            }

            j++;
        }
        return maxSum;
    }
}
