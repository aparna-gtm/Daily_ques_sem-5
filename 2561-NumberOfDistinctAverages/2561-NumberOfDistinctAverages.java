// Last updated: 8/2/2025, 3:15:49 PM
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        double[] avg=new double[nums.length/2];
        
        int j=0;
        int i=0;
        while(j<nums.length/2){
            avg[i++]=(nums[j]+(double)nums[nums.length-1-j])/2;
            j++;

        }
       // System.out.println(Arrays.toString(avg));
        Arrays.sort(avg);
        int c=0;
        int si=0;
        int ei=0;
        while(ei<avg.length){
            if(avg[si]!=avg[ei]){
                c++;
                si=ei;
            }
            ei++;
        }
        c++;
        return c;
    }
}