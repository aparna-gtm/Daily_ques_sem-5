// Last updated: 8/2/2025, 3:24:12 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]!=0){
                    matrix[i][j]=0;
                }
                else if(col[j]!=0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}