// Last updated: 8/2/2025, 3:17:00 PM
class Solution {
    public int findTheWinner(int n, int k) {
        return helper(n,k)+1; // will give the ele
    }
    public static int helper(int n,int k){
        if(n==1){
            return 0;
        }
        int idx=helper(n-1,k);
        idx=(idx+k)%n;
        return idx;
    }

}