// Last updated: 8/2/2025, 3:19:49 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

       
        for (int row = m - 1; row >= 0; row--) {
            
            int r = row, c = 0;
            int ele=mat[row][c];
           
            while (r < m && c < n) {
                if(mat[r][c]!=ele){
                    return false;
                }
                r++;
                c++;
            }

            
        }

       
        for (int col = 1; col < n; col++) {
            
            int r = 0, c = col;
            int el=mat[r][col];
           
            while (r < m && c < n) {
                if(mat[r][c]!=el){
                    return false;
                }
                r++;
                c++;
            }

            
        }
        return true;
       
    }
}