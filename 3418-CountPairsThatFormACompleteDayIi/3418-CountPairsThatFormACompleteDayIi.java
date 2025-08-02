// Last updated: 8/2/2025, 3:15:05 PM
class Solution {
    public long countCompleteDayPairs(int[] time) {
        long[] mod= new long [25];
        for ( int i=0 ; i< time.length ; i++){
            mod [ time[i]%24 ]++;
        }
        long count=0;
        // count for 0 

        count += (mod[0] * (mod[0] - 1) )/2;

        // count for 30 
         count += (mod[12] * (mod[12] - 1) )/2;

        for( int i=1 ; i< 12; i++){
            count += mod[i] * mod[24-i];
        }
        return count;
    }
}