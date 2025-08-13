// Last updated: 8/13/2025, 10:52:59 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] ans=new int[k][k];
        int curr=0;
        for(int i=x;i<x+k;i++){
            int[] arr=new int[k];
            int idx=0;
            for(int j=y;j<y+k;j++){
                arr[idx++]=grid[i][j];
                
            }
            ans[curr++]=arr;
            
            
        }
        int start=0;
        int end=ans.length-1;
        while(start<end){
            int[] temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
            
            
        }
        int[][] res=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i>=x && i<x+k) && (j>=y&& j<y+k)){
                    res[i][j]=ans[i-x][j-y];
                }
                else{
                    res[i][j]=grid[i][j];
                }
            }
        }
        return res;



        
//return ans;
    }
}



