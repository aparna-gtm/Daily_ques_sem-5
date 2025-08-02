// Last updated: 8/2/2025, 3:25:31 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(sum-target);

                if(diff<min){
                    min=diff;
                    ans=sum;
                    
                }
                if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    return ans;
                }
            }
        }
        return ans;

        
    }
}