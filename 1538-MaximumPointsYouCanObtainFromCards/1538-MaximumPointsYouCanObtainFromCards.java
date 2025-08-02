// Last updated: 8/2/2025, 3:17:49 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i=0;i<cardPoints.length;i++){
            total+=cardPoints[i];
        }
        int ans=0;
        int sum=0;
        for(int i=0;i<cardPoints.length-k;i++){
            sum+=cardPoints[i];
        }
        ans=Math.max(ans, total-sum);
        for(int i=cardPoints.length-k;i<cardPoints.length;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-(cardPoints.length-k)];
            ans= Math.max(ans,total-sum);
        }
        return ans;
    }
}