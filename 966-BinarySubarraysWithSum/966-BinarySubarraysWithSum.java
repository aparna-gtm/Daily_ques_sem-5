// Last updated: 8/2/2025, 3:19:07 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result=0;
        int i=0;
        int j=0;
        int sum=0;
        int count_zeros=0;
        while(j<nums.length){
            //grow
            sum+=nums[j];

            // shrink
            while((nums[i]==0 || sum>goal) && i<j){
                if(nums[i]==0){
                    count_zeros++;
                }
                else{
                    count_zeros=0;
                }
                sum-=nums[i];
                i++;
            }
            //update
            if(sum==goal){
                result+= 1+ count_zeros;
            }
            j++;
        }
        return result;
    }
}