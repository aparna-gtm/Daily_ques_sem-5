// Last updated: 8/2/2025, 3:19:40 PM
class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int n=A.length;
        int maxOverlap=0;
        int count=0;
        for(int row_offset=-n+1; row_offset<n; row_offset++){
            for(int col_offset=-n+1; col_offset<n; col_offset++){
                count=overlaps(A,B,row_offset,col_offset);

                maxOverlap=Math.max(maxOverlap,count);
            }
        }
        return maxOverlap;
    }
    public static int overlaps(int[][] A, int[][] B, int row_offset,int col_offset){
        
        int n=A.length;
        int count=0;
        int B_row=0;
        int B_col=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                B_row=i+row_offset;
                B_col=j+col_offset;

                if(B_row<0 || B_row>=n || B_col<0 || B_col>=n){
                    continue;
                }
                if(A[i][j]==B[B_row][B_col] && A[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}