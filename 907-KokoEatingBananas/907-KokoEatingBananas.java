// Last updated: 8/2/2025, 3:19:30 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int end=Integer.MIN_VALUE;
       for(int i=0;i<piles.length;i++){
        end=Math.max(piles[i],end);
       }
        int start=1;
        
        int ans=0;
        while(start<=end){
            int mid=(start)+(end-start)/2;
            System.out.println(mid);
            if(isPossible(piles,mid,h)==true){
                
                // System.out.println(ans);
                end=mid-1;
                ans=mid;
            }
            else{
                // System.out.println("fff");
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] piles,int mid,int maxhours){
        int sumHours=0;
        for(int i=0;i<piles.length;i++){
            sumHours+=Math.ceil((double)piles[i]/mid);
            if(sumHours>maxhours){
                return false;
            }
        }

        
        
           
            return true;
           
        
        
    }
}