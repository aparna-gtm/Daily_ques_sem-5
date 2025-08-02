// Last updated: 8/2/2025, 3:18:18 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
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