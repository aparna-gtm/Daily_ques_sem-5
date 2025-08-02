// Last updated: 8/2/2025, 3:25:41 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long sum=0;
        long num=x;
        while(x>0){
            sum=sum*10+x%10;
            x/=10;
        }
        return sum==num;
    }
}