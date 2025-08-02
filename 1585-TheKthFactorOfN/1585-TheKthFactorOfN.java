// Last updated: 8/2/2025, 3:17:43 PM
class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && c+1==k){
                return i;
            }
            if(n%i==0){
                c++;
            }
        }
        return -1;
    }
}