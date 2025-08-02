// Last updated: 8/2/2025, 3:23:00 PM
class Solution {
    public int maxProduct(int[] nums) {
        int lmax=Integer.MIN_VALUE;
        int lprod=1;
        for(int i=0;i<nums.length;i++){
            lprod*=nums[i];
            lmax=Math.max(lmax,lprod);
            if(lprod==0){
                lprod=1;
            }
        }
        int rmax=Integer.MIN_VALUE;
        int rprod=1;
        for(int i=nums.length-1;i>=0;i--){
            rprod*=nums[i];
            rmax=Math.max(rmax,rprod);
            if(rprod==0){
                rprod=1;
            }
        }
       
       return Math.max(rmax,lmax);
    }
}