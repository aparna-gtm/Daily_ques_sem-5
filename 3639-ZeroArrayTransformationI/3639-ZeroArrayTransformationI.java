// Last updated: 8/2/2025, 3:14:44 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
       int[] diff=new int[nums.length+1];
       for(int i=0;i<queries.length;i++){
            diff[queries[i][0]]++;
            diff[queries[i][1]+1]--;
        }

        for(int i=1;i<diff.length;i++){
            diff[i]=diff[i]+diff[i-1];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>diff[i]){
                return false;
            }
        }
        return true;
        
    }
}