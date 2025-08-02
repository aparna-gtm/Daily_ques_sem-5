// Last updated: 8/2/2025, 3:20:16 PM
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int k=nums.length-1;k>1;k--){
            for(int i=0,j=k-1;i<j;){
                if(nums[i]+nums[j]>nums[k]){
                    c+=j-i;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return c;
    }
}