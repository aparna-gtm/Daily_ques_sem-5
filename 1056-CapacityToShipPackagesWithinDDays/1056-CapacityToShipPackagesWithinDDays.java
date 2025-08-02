// Last updated: 8/2/2025, 3:18:44 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        
        // Find the maximum weight and the sum of all weights
        for (int weight : weights) {
            start = Math.max(start, weight);  // Start should be at least the max weight
            end += weight;  // Sum of all weights
        }
        int ans=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(mid,weights,days)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int capacity,int[] weights,int days){
        //System.out.println(capacity);
        int currdays=0;
        int currcap=0;
        for(int i=0;i<weights.length;i++){
            if(currcap + weights[i] <= capacity){
                currcap+=weights[i];
                
            }
            
            else{
                ///System.out.println(currcap+"dkndlk");
                currdays++;
                currcap = weights[i];
            }
           // System.out.println(currcap);
            if(currdays>=days){
                return false;
            }
        }
        if (currcap > 0) {
        currdays++;
    }

    return currdays <= days;
    }
}