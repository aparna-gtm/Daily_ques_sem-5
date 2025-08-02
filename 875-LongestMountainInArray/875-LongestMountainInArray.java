// Last updated: 8/2/2025, 3:19:36 PM
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int result = 0;

        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Move left pointer to start of the mountain
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Move right pointer to end of the mountain
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Calculate mountain length
                int mountainLength = right - left + 1;
                result = Math.max(result, mountainLength);

                // Move i to the right pointer to skip already processed elements
                i = right;
            }
        }
        
        return result;
    }
}