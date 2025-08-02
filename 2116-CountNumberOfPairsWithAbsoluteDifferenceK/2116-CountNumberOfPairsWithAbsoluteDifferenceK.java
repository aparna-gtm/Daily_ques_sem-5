// Last updated: 8/2/2025, 3:16:50 PM
class Solution {
    public int countKDifference(int[] nums, int k) {
    int count = 0, data[] = new int[101];
    for (int num : nums) data[num]++;
    for (int i = 0; i <= 100 - k; i++)
        count += data[i] * data[i + k];
    return count;
    }
}