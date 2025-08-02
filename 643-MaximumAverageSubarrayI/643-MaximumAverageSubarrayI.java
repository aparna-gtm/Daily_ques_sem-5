// Last updated: 8/2/2025, 3:20:12 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=i;j<=i-1+k;j++){
                sum+=nums[j];
                // System.out.println(sum);
                 
            }
            
            ans=Math.max(sum,ans);
            
        }
        return (double)ans/k;
    }
}