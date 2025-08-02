// Last updated: 8/2/2025, 3:22:34 PM
class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;

    }
    public static void dfs(char[][] grid,int i,int j){
        if(i<0 || i >= grid.length || j<0 || j >= grid[0].length || grid[i][j]=='$' || grid[i][j] == '0'){
            return;
        }
        grid[i][j]='$';
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);

    }
}