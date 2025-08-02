// Last updated: 8/2/2025, 3:25:06 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;

        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}