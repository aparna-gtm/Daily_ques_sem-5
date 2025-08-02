// Last updated: 8/2/2025, 3:21:43 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]>=2){
                return i;
            }
        }
        return -1;
    }
}