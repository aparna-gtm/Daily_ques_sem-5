// Last updated: 8/2/2025, 3:15:55 PM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        // System.out.println(min+" "+max);
        int start=min;
        int end=max;
        long ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            long cost1=costcount(nums,mid,cost);
            long cost2=costcount(nums,mid+1,cost);
            ans=Math.min(cost1,cost2);
            if(cost1>cost2){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static long costcount(int[] nums,int mid,int[] cost){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(long)Math.abs(nums[i]-mid)*cost[i];
        }
        // System.out.println(ans);
        return ans;
    }
}