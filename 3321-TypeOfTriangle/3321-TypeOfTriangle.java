// Last updated: 8/2/2025, 3:15:08 PM
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int one=nums[0]+nums[1];
        int two=nums[1]+nums[2];
        int three=nums[2]+nums[0];
        if(one<=nums[2] || two<=nums[0] && three<=nums[1] ){
            return "none";
        }
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if(nums[0]!=nums[1] && nums[1]!=nums[2]){
            return "scalene";
        }
        return "isosceles";
    }
}