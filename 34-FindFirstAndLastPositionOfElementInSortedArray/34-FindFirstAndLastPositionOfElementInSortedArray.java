// Last updated: 8/2/2025, 3:25:08 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=binarySearch(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=binarySearch(nums,target,false);
        }
        return ans;
    }
    public static int binarySearch(int[] nums,int target,boolean pos){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(pos){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}