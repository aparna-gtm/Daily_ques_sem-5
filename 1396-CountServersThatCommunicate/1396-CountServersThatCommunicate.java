// Last updated: 8/2/2025, 3:18:14 PM
class Solution {
    public int countServers(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        
        int[] row=new int[grid.length];
        int[] col=new int[grid[0].length];

        


       for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));

        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1 && (row[i]>1 || col[j] > 1)) {
                    count++;
                }
            }
        }
        return count;

    }
}