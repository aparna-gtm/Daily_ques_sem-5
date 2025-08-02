// Last updated: 8/2/2025, 3:21:23 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        return fun(n);
    }
    public static int fun(int n){
        if(n==2){
            return 91;

        }
        
        int c=8;
        int x=1;
        for(int i=0;i<n;i++){
            if(i==0 || i==1){
                x*=9;
            }
            else{
                x*=c--;
            }
        }
        return x +fun(n-1);
    }
}