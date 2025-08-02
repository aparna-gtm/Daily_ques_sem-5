// Last updated: 8/2/2025, 3:24:55 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int isPos=0;
        int start=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                start=i;
                isPos=1;
                break;
            }
        }
        if(nums[start]>1 || isPos==0){
            return 1;
        }
        for(int i=start+1;i<nums.length;i++){
            if(nums[i-1]==nums[i] || nums[i-1]+1==nums[i]){
                continue;
            }
            else{
                return nums[i-1]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}