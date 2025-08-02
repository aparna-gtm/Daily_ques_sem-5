// Last updated: 8/2/2025, 3:15:46 PM
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] matrix=new int[grid.length][grid[0].length];
        int[] rowOne=new int[grid.length];
        int[] colOne=new int[grid[0].length];
        for (int i = 0; i<grid.length; i++) {
            for (int j = 0;j<grid[0].length; j++) {
                rowOne[i] += grid[i][j];
                colOne[j] += grid[i][j];
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                matrix[i][j]=rowOne[i]+colOne[j]-(grid.length-rowOne[i])-(grid[0].length-colOne[j]);
            }
        }
        return matrix;
    }
}