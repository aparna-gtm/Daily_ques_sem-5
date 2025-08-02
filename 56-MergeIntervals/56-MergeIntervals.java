// Last updated: 8/2/2025, 3:24:26 PM
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[intervals.length][2];
        int k = 0;

        // Initialize the current interval to the first interval in the sorted list
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the next interval, merge them
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // If there is no overlap, store the current interval and update `current`
                ans[k++] = current;
                current = intervals[i];
            }
        }
        // Add the last interval
        ans[k++] = current;

        // Return only the populated part of `ans`
        return Arrays.copyOfRange(ans, 0, k);
    }
}
