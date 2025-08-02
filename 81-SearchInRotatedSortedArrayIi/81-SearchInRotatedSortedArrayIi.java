// Last updated: 8/2/2025, 3:24:00 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                return true;
            }
            else if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                end--;
                start++;
                continue;
                
            }
            else if(nums[start]<=nums[mid]){   //left half is sorted
                if(nums[start]<=target && nums[mid]>=target){
                    end=mid-1;
                }
                else{                          
                    start=mid+1;
                }
            }
            else {                                // right half is sorted
                if(nums[mid]<=target && nums[end]>=target){
                     start=mid+1;
                }
                else{                          
                    end=mid-1;
                }

            }
            
        }
        return false;
    }
}