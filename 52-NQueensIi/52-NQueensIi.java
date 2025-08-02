// Last updated: 8/2/2025, 3:24:39 PM
class Solution {
    static int c=0;
    public int totalNQueens(int n) {
        c=0;
        boolean[][] board=new boolean[n][n];
        queens(n,0,0,board);
        return c;
    }
    public static void queens(int n,int qpsf,int row,boolean[][] board){
        if(qpsf==n){
            c++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,n,row,i)){
                board[row][i]=true;
                queens(n,qpsf+1,row+1,board);
                board[row][i]=false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board,int n,int row,int col){
        //up
        int i=row;
        while(i>=0){
            if(board[i][col]==true){
                return false;
            }
            i--;
        }
        i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]==true){
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j]==true){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}