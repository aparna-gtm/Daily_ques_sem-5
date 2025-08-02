// Last updated: 8/2/2025, 3:16:27 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int p=0;
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                res[p]=nums[i];
                p+=2;
            }
            else{
                res[n]=nums[i];
                n+=2;
            }
        }
        return res;
    }
}