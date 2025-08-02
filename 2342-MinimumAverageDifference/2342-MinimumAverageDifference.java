// Last updated: 8/2/2025, 3:16:18 PM
class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long min=Integer.MAX_VALUE;
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        
        long a1=0,a2=0;
        int idx=0;
        long sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            long pre=sum1;
            long post=total-sum1;

            a1=pre/(i+1);
            if(nums.length-i-1!=0) a2=post/(nums.length-i-1);
            else a2=0;

            long cal=Math.abs(a1-a2);
            if(cal<min){
                min=Math.min(min,cal);
                idx=i;
            }
            
        }
        return idx;
    }
}