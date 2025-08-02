// Last updated: 8/2/2025, 3:18:25 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        long end=0;
        for(int i=0;i<candies.length;i++){
            end+=candies[i];
        }
        if(end<k){
            return 0;
        }
        long ans=0;
        long start=1;
        end=candies[candies.length-1];
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossible(candies,mid,k)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;


    }
    public static boolean isPossible(int[] arr,long mid,long k){
        long count=0;
        for(int i: arr){
            count+=i/mid;
            if(count>=k){
                return true;
            }
        }
        return count>=k;

    }
}