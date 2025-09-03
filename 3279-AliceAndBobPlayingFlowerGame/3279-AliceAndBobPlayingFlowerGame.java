// Last updated: 9/3/2025, 12:20:08 PM
class Solution {
    public long flowerGame(int n, int m) {
       

        long oddN=(n+1)/2;
        long evenN=n/2;

        long oddM=(m+1)/2;
        long evenM=m/2;

        long ans=oddN*evenM + evenN*oddM;
        return ans;
    }
}