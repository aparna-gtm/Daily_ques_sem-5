// Last updated: 8/2/2025, 3:18:53 PM
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int[] ans=new int[nums.length];
        int index=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int idx=queries[i][1];
            if(nums[idx]%2==0){
                sum-=nums[idx];
            }
            nums[idx]=nums[idx]+val;
            if(nums[idx]%2==0){
                sum+=nums[idx];
            }
            
            ans[index++]=sum;
            

        }
        return ans;
    }
}