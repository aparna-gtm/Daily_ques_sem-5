// Last updated: 8/2/2025, 3:19:00 PM
class Solution {
    public int fib(int n) {
         return helper(n);
    }
    public static int helper(int n){
        if(n==0 || n==1){
            return n;
        }
        int x1= helper(n-1);
        int x2= helper(n-2);
        return x1+x2;
    }
}