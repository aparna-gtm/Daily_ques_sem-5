// Last updated: 8/18/2025, 6:13:01 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n=prices.length;
        long base=0;
        for(int i=0;i<n;i++){
            base += (long) strategy[i] * prices[i];
        }

        long[] first=new long[n+1];
        long[] second=new long[n+1];

        for(int j=0;j<n;j++){
            second[j+1]=second[j]+prices[j];
            first[j+1]=first[j]+(long)prices[j] * strategy[j];
            
        }
        long gain=0;
        int h=k/2;
        for(int i=0;i+k<=n;i++){
            int j=k+i;
            long one=first[j]-first[i];
            long two=second[j]-second[h+i];
            long diff=two-one;
            gain=Math.max(gain,diff);

            
        }
        return base+gain;
    }
}