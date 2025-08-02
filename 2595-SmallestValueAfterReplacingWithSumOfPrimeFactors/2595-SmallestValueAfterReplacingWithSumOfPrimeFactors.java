// Last updated: 8/2/2025, 3:15:48 PM
class Solution {
    public int smallestValue(int n) {
        while(true){
            int sum=prime_fact_digits(n);
            if(sum==n){
                return sum;
            }
            n=sum;


        }
       
    }
     public static int prime_fact_digits(int n){
            int sum=0;
            int i=2;
            while(n>1){
                if(n%i==0){
                    n=n/i;
                    sum+=i;
                }
                else{
                    i++;
                }
            }
            return sum;
        }
        
}