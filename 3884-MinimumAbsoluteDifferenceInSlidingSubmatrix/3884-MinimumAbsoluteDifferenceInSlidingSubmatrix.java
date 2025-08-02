// Last updated: 8/2/2025, 3:13:54 PM
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int row=(grid.length-k+1);
        int col=grid[0].length-k+1;
        int[][] ans=new int[row][col];
        for(int roww=0;roww+k<=grid.length;roww++){
            for(int coll=0;coll+k<=grid[0].length;coll++){
                List<Integer> list=new ArrayList<>();
                int[] mat=new int[k*k];
                int idx=0;
                for(int i=roww;i<roww+k;i++){
                    for(int j=coll;j<coll+k;j++){
                        mat[idx++]=(grid[i][j]);
                    }
                }
                // Collections.sort(list);
                Arrays.sort(mat);
                //System.out.println(list);
                int min=Integer.MAX_VALUE;
                for(int i=1;i<mat.length;i++){
                    if(mat[i]!=mat[i-1]){
                        min=Math.min(min,mat[i]-mat[i-1]);
                    }
                }
                ans[roww][coll]=(min==Integer.MAX_VALUE)?0:min;
            }
        }
        return ans;
    }
}