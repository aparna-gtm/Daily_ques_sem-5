// Last updated: 8/2/2025, 3:25:54 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        
        for(int i=0;i<nums.length;i++){
            int second=target-nums[i];
            if(map.containsKey(second)){
                ans[0]=map.get(second);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}