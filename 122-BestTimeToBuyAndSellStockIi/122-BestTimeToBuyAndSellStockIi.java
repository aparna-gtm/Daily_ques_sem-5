// Last updated: 8/2/2025, 3:23:29 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}