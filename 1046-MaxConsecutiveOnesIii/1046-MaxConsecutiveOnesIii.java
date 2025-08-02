// Last updated: 8/2/2025, 3:18:48 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int si=0;
        int ei=0;
        int n=0;
        int max=Integer.MIN_VALUE;
        while(ei<nums.length){
            if(nums[ei]==0){
                n++;
            }
            while(n>k && si<=ei){
               
                if(nums[si]==0 ){
                    n--;
                }
                si++;
            }
            max=Math.max(max,ei-si+1);
            ei++;
        }
       
        return max;
    }
}