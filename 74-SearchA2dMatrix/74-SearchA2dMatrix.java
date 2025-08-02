// Last updated: 8/2/2025, 3:24:11 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target) {
                ans = mid;
                break;
            } else if (matrix[mid][0] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }

        }
        // System.out.println(matrix[ans][0]);
        int s = 0;
        int e = matrix[0].length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (matrix[ans][mid] == target) {
                return true;
            } else if (matrix[ans][mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;

            }

        }
        return false;

    }
}