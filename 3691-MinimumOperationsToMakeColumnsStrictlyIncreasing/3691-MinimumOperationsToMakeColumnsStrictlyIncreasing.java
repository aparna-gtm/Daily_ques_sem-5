// Last updated: 8/2/2025, 3:14:40 PM
class Solution {
    public int minimumOperations(int[][] grid) {
       
        int opr=0;
        for(int j=0;j<grid[0].length;j++){
            for(int i=0;i<grid.length;i++){
                if(i>0 && grid[i][j]<=grid[i-1][j] ){
                 
                     opr+=Math.abs(grid[i-1][j]-grid[i][j])+1+grid[i][j]-grid[i][j];
                    grid[i][j]+=Math.abs(grid[i-1][j]-grid[i][j])+1;
                 
                   
                }
                
            }
        }
       
        return opr;
    }
}