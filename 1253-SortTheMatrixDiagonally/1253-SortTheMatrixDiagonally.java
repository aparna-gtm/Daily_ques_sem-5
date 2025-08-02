// Last updated: 8/2/2025, 3:18:33 PM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

       
        for (int row = m - 1; row >= 0; row--) {
            List<Integer> list = new ArrayList<>();
            int r = row, c = 0;

           
            while (r < m && c < n) {
                list.add(mat[r][c]);
                r++;
                c++;
            }

            Collections.sort(list);

           
            r = row;
            c = 0;
            int k = 0;
            while (r < m && c < n) {
                mat[r][c] = list.get(k++);
                r++;
                c++;
            }
        }

       
        for (int col = 1; col < n; col++) {
            List<Integer> list = new ArrayList<>();
            int r = 0, c = col;

           
            while (r < m && c < n) {
                list.add(mat[r][c]);
                r++;
                c++;
            }

            Collections.sort(list);

           
            r = 0;
            c = col;
            int k = 0;
            while (r < m && c < n) {
                mat[r][c] = list.get(k++);
                r++;
                c++;
            }
        }

        return mat;
    }
}
