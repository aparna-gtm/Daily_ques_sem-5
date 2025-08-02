// Last updated: 8/2/2025, 3:24:41 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        List<List<String>> ans=new ArrayList<>();
      
        queens(n,0,0,board,ans);
        return ans;
    }
    public static void queens(int n,int qpsf,int row,boolean[][] board,List<List<String>> ans){
        if(qpsf==n){
            add(board,ans);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,n,row,i)){
                board[row][i]=true;
               
                queens(n,qpsf+1,row+1,board,ans);
                
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
    public static void add(boolean[][] board,List<List<String>> ans){
        List<String> ll=new ArrayList<>();
        
        for(int i=0;i<board.length;i++){
            StringBuilder sb=new StringBuilder();
            
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==false){
                    sb.append(".");
                }
                else{
                    sb.append("Q");
                }
            }
            ll.add(sb.toString());
            

        }
        
        ans.add(new ArrayList<>(ll));
    }
}