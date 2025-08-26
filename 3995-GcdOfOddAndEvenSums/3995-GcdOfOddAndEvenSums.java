// Last updated: 8/26/2025, 1:46:53 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        long a=n*n;
        long b=n*(n+1);
        
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return (int) a;
      
    }
}