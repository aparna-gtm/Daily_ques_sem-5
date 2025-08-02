// Last updated: 8/2/2025, 3:22:32 PM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        set.add(n);
        while(n>1){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            if(set.contains(sum)){
                return false;
            }
           
            n=sum;
            if(n==1){
                return true;
            }
           
            set.add(sum);
        }
        return true;
    }
}