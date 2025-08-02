// Last updated: 8/2/2025, 3:16:23 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start = Integer.MAX_VALUE;
        for (int t : time) {
            start = Math.min(t , start);
        }
        long end=Integer.MAX_VALUE;
        
        for(int i=0;i<time.length;i++){
            end=Math.min(time[i],end);
        }
        end=totalTrips*end;
        long timeReq=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossible(time,totalTrips,mid)){
                timeReq=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return timeReq;
    }
    public static boolean isPossible(int[] time,int totalTrips,long mid){
        long trips=0;
        for(int i=0;i<time.length;i++){
            trips+=((double)mid/time[i]);

        }
        if(trips>=totalTrips){
            return true; 
        }
        return false;
    }
}