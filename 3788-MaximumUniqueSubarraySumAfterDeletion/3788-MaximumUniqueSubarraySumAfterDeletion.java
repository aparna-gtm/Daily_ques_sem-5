// Last updated: 8/2/2025, 3:14:10 PM
class Solution {
    public int maxSum(int[] nums) {
        boolean contain=false;
        int psum=0;
        Set<Integer> pset=new HashSet<Integer>();
        int maxn=Integer.MIN_VALUE;
        for(int x : nums){
            if(x>=0){
                contain=true;
                if(x>0){
                    pset.add(x);
                    
                }
            }
                else{
                    maxn=Math.max(maxn,x);
                }
            
        }
        if(contain){
            for(int x : pset){
                psum+=x;
                
            }
            return psum;
        }
         return maxn;
    }
   
}