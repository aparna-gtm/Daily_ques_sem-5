// Last updated: 8/2/2025, 3:18:03 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int[] count=new int[101];
        count[0]=0;
        for(int i=1;i<freq.length;i++){
            count[i]=count[i-1]+freq[i-1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=count[nums[i]];
        }
        return ans;
    }
}