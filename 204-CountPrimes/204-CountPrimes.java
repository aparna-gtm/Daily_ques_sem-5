// Last updated: 8/2/2025, 3:22:28 PM
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1 || n==2) return 0;
        return count(n);
    }
    public static int count(int n){
        boolean[] prime=new boolean[n];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=true;
                }
            }
        }
        int c=0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==false){
                c++;
            }
        }
        return c;
    }
}