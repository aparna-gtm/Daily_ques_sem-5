// Last updated: 8/2/2025, 3:14:35 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<grid.length;i++){
            if(i%2==0){
                for(int j=0;j<grid[i].length;j++){
                    if(j%2==0){
                        list.add(grid[i][j]);
                    }
                    //skip=1;
                }
            }
            else{
                for(int j=grid[i].length-1;j>=0;j--){
                    if(j%2!=0){
                        list.add(grid[i][j]);
                    }
                }
            }
        }
        return list;
    }
}