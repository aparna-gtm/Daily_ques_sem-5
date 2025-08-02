// Last updated: 8/2/2025, 3:19:56 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i : nums){
            total+=i;
        }
        int sum=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            lsum=sum;
            sum+=nums[i];
            rsum=total-sum;
            if(lsum==rsum){
                return i;
            }
            
        }
        return -1;
    }
}