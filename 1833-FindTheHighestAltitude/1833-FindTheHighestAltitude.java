// Last updated: 8/2/2025, 3:17:19 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            ans=Math.max(ans,sum);
            
        }
        return ans;
    }
}