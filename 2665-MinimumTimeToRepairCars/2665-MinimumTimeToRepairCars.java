// Last updated: 8/2/2025, 3:15:40 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long start=1;
        long end=0;
        for(int i=0;i<ranks.length;i++){
            end=Math.max(end,ranks[i]);
        }
        end=end*cars*cars;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossible(ranks,cars,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] ranks,int cars,long maxTime ){
        long totalCars = 0;

        for (int rank : ranks) {
            long carsByThisWorker = (long) Math.sqrt(maxTime / rank);
            totalCars += carsByThisWorker;

            if (totalCars >= cars) {
                return true;
            }
        }
        return false;
    }
}