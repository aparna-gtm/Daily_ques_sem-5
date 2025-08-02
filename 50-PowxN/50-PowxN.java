// Last updated: 8/2/2025, 3:24:42 PM
class Solution {
    public double myPow(double x, int n) {
        double ans= pow(x,n);
        if(n<0) ans=1/ans;
        return ans;
    }
    public static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double ans=pow(x,n/2);
        ans=ans*ans;
        if(n%2!=0){
            ans*=x;
        }
        return ans;
    }
}