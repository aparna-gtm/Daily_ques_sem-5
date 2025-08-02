// Last updated: 8/2/2025, 3:14:12 PM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int l=bounds[0][0];
        int r=bounds[0][1];
        for(int i=1;i<original.length;i++){
            int diff=original[i]-original[i-1];
            l=Math.max(l+diff,bounds[i][0]);
            r=Math.min(r+diff,bounds[i][1]);

            if(l>r){
                return 0;
            }
        }
        return r-l+1;
    }
}