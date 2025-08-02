// Last updated: 8/2/2025, 3:20:28 PM
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                continue;
                }
                if(Math.abs(nums[i]-nums[j])==k){
                    System.out.println(nums[i]+" "+nums[j]);
                    c++;
                }
            }
        }
        return c;
    }
}