// Last updated: 8/2/2025, 3:19:47 PM
class Solution {
    public int kthGrammar(int n, int k) {
        return helper(n,k);
    }
    public static int helper(int n,int k){
        if(n==1 && k==1){
            return 0;
        }
        int length=(int)Math.pow(2,n-1);
        int mid=length/2;

        if(k<=mid){
            return helper(n-1,k);
        }
        else{
            return 1-helper(n-1,k-mid);
        }
    }
}