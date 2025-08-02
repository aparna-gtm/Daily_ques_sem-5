// Last updated: 8/2/2025, 3:14:00 PM
class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans=new int[cost.length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<cost.length;i++){
            min=Math.min(min,cost[i]);
            ans[i]=min;
        }
        return ans;
    }
}