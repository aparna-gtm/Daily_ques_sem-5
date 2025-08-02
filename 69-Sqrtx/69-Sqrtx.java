// Last updated: 8/2/2025, 3:24:16 PM
class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        if(x==2){
            return 1;
        }
        
            long ans=-1;
            long start=1;
            long end=x/2;
            while(start<=end){
                long mid=start+(end-start)/2;
                if(mid*mid<=x){
                    ans=mid;
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                
            }
            return (int)ans;
        

    }
}