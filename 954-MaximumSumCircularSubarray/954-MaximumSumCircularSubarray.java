// Last updated: 8/2/2025, 3:19:12 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //max sum using kadane
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }

        //min sum using kadane
        int minSum=Integer.MAX_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            minSum=Math.min(minSum,sum);
            if(sum>0){
                sum=0;
            }
        }

        // total sum
        int total=0;
        for(int i:nums){
            total+=i;
        }

        // if all elements are -ve then total=minSum
        if(total==minSum){
            return maxSum;
        }

        // cicular sum--> total-minSum;
        int cSum=total-minSum;
        
        //  compare cSum and kadane's max sum and return the greater
        return Math.max(cSum,maxSum);


    }
}