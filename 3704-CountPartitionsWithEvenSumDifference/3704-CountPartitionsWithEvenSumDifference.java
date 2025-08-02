// Last updated: 8/2/2025, 3:14:38 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int count=0;
        int leftsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=total-leftsum;

            if((leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}