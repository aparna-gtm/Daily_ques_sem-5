// Last updated: 8/2/2025, 3:18:22 PM
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] board=new int[8][8];
        for(int i=0;i<queens.length;i++){
            int x1=queens[i][0];
            int x2=queens[i][1];
            board[x1][x2]=1;
        }
        List<List<Integer>> ans=new ArrayList<>();
        int[][] dir={{0,1},{0,-1},{-1,-1},{-1,0},{-1,1},{1,0},{1,1},{1,-1}};
        for(int i=0;i<dir.length;i++){
            int x=king[0]+dir[i][0];
            int y=king[1]+dir[i][1];
            while(x>=0 && y>=0 && x<8 && y<8){
                if(board[x][y]==1){
                    List<Integer> list=new ArrayList<>();
                    list.add(x);
                    list.add(y);
                    ans.add(list);
                    break;
                }
                x+=dir[i][0];
                y+=dir[i][1];
            }
            
        }
        return ans;
    }
}