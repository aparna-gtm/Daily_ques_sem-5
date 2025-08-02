// Last updated: 8/2/2025, 3:18:10 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            end=Math.max(end,nums[i]);
        }
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(nums,threshold,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] nums,int threshold,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/divisor);
            
            if(sum>threshold){
                return false;
            }
        }

        
        
        return true;
    }
}