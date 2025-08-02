// Last updated: 8/2/2025, 3:15:33 PM
class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length/2-1;
        int j=nums.length-1;
        int c=0;
        while(i>=0 && j>=nums.length/2){
            if(2*nums[i]<=nums[j]){
                c+=2;
                i--;
                j--;
            }
            else{
                i--;

            }
        }
        return c;
    }
}