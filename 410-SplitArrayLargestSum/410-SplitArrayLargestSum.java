// Last updated: 8/2/2025, 3:21:07 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;

    }
    public static boolean isPossible(int[]nums , int mid, int k){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];

            }
            else{
                sum=nums[i];
                count++;
            }
            if(count>k){
                return false;
            }
        }
        return true;

    }
}