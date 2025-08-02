// Last updated: 8/2/2025, 3:18:46 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long[] mod= new long [61];
        for ( int i=0 ; i< time.length ; i++){
            mod [ time[i]%60 ]++;
        }
        int count=0;
        // count for 0 

        count += (mod[0] * (mod[0] - 1) )/2;

        // count for 30 
         count += (mod[30] * (mod[30] - 1) )/2;

        for( int i=1 ; i< 30; i++){
            count += mod[i] * mod[60-i];
        }
        return count;
    }
}