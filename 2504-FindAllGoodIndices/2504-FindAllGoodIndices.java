// Last updated: 8/2/2025, 3:15:58 PM
class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }

        for (int i = k; i < n - k; i++) {
            if (left[i - 1] >= k && right[i + 1] >= k) {
                result.add(i);
            }
        }

        return result;
    }
}
