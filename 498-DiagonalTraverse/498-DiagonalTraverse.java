// Last updated: 8/2/2025, 3:20:37 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int row=0;
        int col=0;
        boolean isUp=true;
        
        int idx=0;
        int[] arr = new int[mat.length* mat[0].length];


        while(row<n && col<m){
            if(isUp){
                while(row>0 && col<m-1){
                    arr[idx++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[idx++] = mat[row][col];
                if(col==m-1){
                    row++;
                }
                else{
                    col++;
                }


            }
            else{
                while(row<n-1 && col>0){
                    arr[idx++]=mat[row][col];
                    row++;
                    col--;
                }
                arr[idx++] = mat[row][col];
                if(row==n-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            isUp=!isUp;
        }
        return arr;
    }
}