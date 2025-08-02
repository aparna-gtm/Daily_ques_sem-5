// Last updated: 8/2/2025, 3:23:14 PM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
               
                if(j-i==3){
                    
                    i=j;
                    // System.out.println(i);

                }
                else if(j-i==1){
                    return nums[i];
                }
            }
            j++;
        }
        return nums[i];
    }
}