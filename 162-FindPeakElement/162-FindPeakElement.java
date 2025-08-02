// Last updated: 8/2/2025, 3:22:52 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Compare mid element with the next element
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1; // Move to the right half
            } else {
                end = mid; // Mid could be a peak, search left including mid
            }
        }
        
        // When start == end, we've found the peak
        return start;
    }
}
