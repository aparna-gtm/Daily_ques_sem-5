// Last updated: 8/2/2025, 3:14:51 PM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] avg=new double[nums.length/2];
        
        int j=0;
        int i=0;
        while(j<nums.length/2){
            avg[i++]=(nums[j]+(double)nums[nums.length-1-j])/2;
            j++;

        }
        
        Arrays.sort(avg);
        return avg[0];
    }
}