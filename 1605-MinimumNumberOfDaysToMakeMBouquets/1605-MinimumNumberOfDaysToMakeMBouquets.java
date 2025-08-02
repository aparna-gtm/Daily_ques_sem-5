// Last updated: 8/2/2025, 3:17:38 PM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int low=0;
        int high=0;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
        }
        for(int i=0;i<bloomDay.length;i++){
            high=Math.max(high,bloomDay[i]);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,m,k,mid)){
                System.out.println(mid);
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] bloomDay, int m, int k, int days) {
        int flower = 0;
        int count = 0; 

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                count++; 
                if (count == k) { 
                    flower++;
                    count = 0; 
                }
            } else {
                count = 0;
            }

            if (flower >= m) {
                return true;
            }
        }
        return flower >= m; 
    }

}