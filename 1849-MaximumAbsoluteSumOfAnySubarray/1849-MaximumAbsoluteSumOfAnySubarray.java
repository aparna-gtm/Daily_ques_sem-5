// Last updated: 8/2/2025, 3:17:17 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        int sum2=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
            min=Math.min(sum2,min);
            if(sum2>0){
                sum2=0;
            }
        }
       // System.out.println(sum2+" "+sum);
        return Math.max(-min,max);
    }
}