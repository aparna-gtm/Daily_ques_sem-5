// Last updated: 8/2/2025, 3:15:36 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;

        // Step 1: Preprocess positions of elements in the matrix
        Map<Integer, int[]> positions = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                positions.put(mat[i][j], new int[]{i, j});
            }
        }

        // Step 2: Initialize frequency arrays
        int[] row_freq = new int[m];
        int[] col_freq = new int[n];

        // Step 3: Process each element in arr
        for (int i = 0; i < arr.length; i++) {
            int[] pos = positions.get(arr[i]);
            int row = pos[0];
            int col = pos[1];

            row_freq[row]++;
            col_freq[col]++;

            // Step 4: Check if a row or column is completely painted
            if (row_freq[row] == n || col_freq[col] == m) {
                return i;
            }
        }

        // No row or column was completely painted
        return -1;
    }
}
