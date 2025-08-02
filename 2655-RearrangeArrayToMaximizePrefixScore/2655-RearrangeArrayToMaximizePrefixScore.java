// Last updated: 8/2/2025, 3:15:41 PM
class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        
        long[] prefix=new long[nums.length];
        prefix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            prefix[i]=nums[i]+prefix[i+1];
        }
        
        
        int count=0;
        for(int i=prefix.length-1;i>=0;i--){
            if(prefix[i]>0){
                count++;
            }
        }
        return count;
    }
}