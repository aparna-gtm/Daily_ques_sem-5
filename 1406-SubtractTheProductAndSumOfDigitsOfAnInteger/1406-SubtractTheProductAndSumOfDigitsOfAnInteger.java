// Last updated: 8/2/2025, 3:18:12 PM
class Solution {
    public int subtractProductAndSum(int n) {
        return answer(n);
    }
    public static int answer(int n){
        int sum = 0;
        int p=1;
        while(n>0){
            int d = n%10;
            sum+=d;
            p*=d;
            n=n/10;
        }
        return p-sum;
    }
}