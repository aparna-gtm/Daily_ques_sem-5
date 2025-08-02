// Last updated: 8/2/2025, 3:16:08 PM
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int max=0;
            int sum1=0;
            for(int j=0;j<nums.length;j++){
                sum1+=nums[j];
                if(sum1>queries[i]){
                    break;
                }
                else{
                    max=Math.max(j+1,max);
                }
            }
            ans[i]=max;
        }
        return ans;
    }
}